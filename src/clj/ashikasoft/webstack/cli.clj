(ns ashikasoft.webstack.cli
  (:require [clojure.tools.cli :as cli]
            [clojure.tools.logging :as log]
            [integrant.core :as ig]))

(def cli-options-config
  "The command line option config, used by parse-opts."
  [["-p" "--port PORT" "Port number"
    :parse-fn #(Integer/parseInt %)]])

(defn parse-options [args]
  (or (cli/parse-opts args cli-options-config) {}))

(defn add-shutdown-hook [stop-fn]
  (.addShutdownHook (Runtime/getRuntime) (Thread. stop-fn)))

