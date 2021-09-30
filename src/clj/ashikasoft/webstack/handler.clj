;; This code is based on the Reitit docs and code generated from the Luminus template.
(ns ashikasoft.webstack.handler
  (:require [ashikasoft.webstack.layout :as layout]
            [reitit.ring :as ring]
            [ring.middleware.content-type :refer [wrap-content-type]]
            [ring.middleware.webjars :refer [wrap-webjars]]))

(defn common-routes-custom [error-page-fn]
  (ring/routes
    (ring/create-resource-handler
      {:path "/"})
    (wrap-content-type
      (wrap-webjars (constantly nil)))
    (ring/create-default-handler
      {:not-found
       (constantly (error-page-fn {:status 404, :title "404 - Page not found"}))
       :method-not-allowed
       (constantly (error-page-fn {:status 405, :title "405 - Not allowed"}))
       :not-acceptable
       (constantly (error-page-fn {:status 406, :title "406 - Not acceptable"}))})))

(defn common-routes []
  (common-routes-custom layout/error-page))
