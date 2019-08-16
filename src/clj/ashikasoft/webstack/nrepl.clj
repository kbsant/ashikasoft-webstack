(ns ashikasoft.webstack.nrepl
  (:require [luminus.repl-server :as repl]
            [integrant.core :as ig]))

(defmethod ig/init-key :ashikasoft/nrepl [_ {:keys [env]}]
  (when-let [nrepl-port (env :nrepl-port)]
    (repl/start {:port nrepl-port})))

(defmethod ig/halt-key! :ashikasoft/nrepl [_ nrepl]
    (when nrepl
      (repl/stop nrepl)))

