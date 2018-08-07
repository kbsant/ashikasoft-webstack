(ns ashikasoft.webstack.httpd
  (:require [luminus.repl-server :as repl]
            [luminus.http-server :as http]
            [integrant.core :as ig]))

(defmethod ig/init-key :ashikasoft/httpd [_ {:keys [handler env]}]
  (http/start
    (-> env
        (assoc :handler handler)
        (update :io-threads #(or % (* 2 (.availableProcessors (Runtime/getRuntime)))))
        (update :port #(or (-> env :options :port) %)))))

(defmethod ig/halt-key! :ashikasoft/httpd [_ httpd]
  (http/stop httpd))

#_
(defmethod ig/init-key :ashikasoft/nrepl [_ {:keys [env]}]
  (when-let [nrepl-port (env :nrepl-port)]
    (repl/start {:port nrepl-port})))
#_
(defmethod ig/halt-key! :ashikasoft/nrepl [_ nrepl]
    (repl/stop nrepl))

