(ns ashikasoft.webstack.core
  (:require [clojure.tools.cli :as cli]
            [clojure.tools.logging :as log]
            [integrant.core :as ig]))

(def cli-options-config
  "The command line option config, used by parse-opts."
  [["-p" "--port PORT" "Port number"
    :parse-fn #(Integer/parseInt %)]])

(defn cli-options [args]
  (or (cli/parse-opts args cli-options-config) {}))

(defn stop-deps [system]
  (ig/halt! system)
  (log/info "Stopped components:" (keys system)))

(defn start-deps [configuration]
  (let [system (ig/init configuration)]
    (log/info "Started components:" (keys system))
    system))

(defn stop-app [system]
  (stop-deps system)
  (shutdown-agents))

(defn start-app [configuration]
  (let [system (start-deps configuration)]
    (.addShutdownHook (Runtime/getRuntime) (Thread. #(stop-app system)))
    system))

