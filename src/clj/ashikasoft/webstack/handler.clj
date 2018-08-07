;; This code is based on the Reitit docs and code generated from the Luminus template.
(ns ashikasoft.webstack.handler
  (:require [ashikasoft.webstack.layout :refer [error-page]]
            [reitit.ring :as ring]
            [ring.middleware.content-type :refer [wrap-content-type]]
            [ring.middleware.webjars :refer [wrap-webjars]]))

(defn common-routes []
  (ring/routes
    (ring/create-resource-handler
      {:path "/"})
    (wrap-content-type
      (wrap-webjars (constantly nil)))
    (ring/create-default-handler
      {:not-found
       (constantly (error-page {:status 404, :title "404 - Page not found"}))
       :method-not-allowed
       (constantly (error-page {:status 405, :title "405 - Not allowed"}))
       :not-acceptable
       (constantly (error-page {:status 406, :title "406 - Not acceptable"}))})))
