;; This code is mostly generated from the Luminus template and is EPL.
(ns ashikasoft.webstack.middleware
  (:require 
   [clojure.tools.logging :as log]
   [ashikasoft.webstack.layout :refer [*app-context* error-page]]
   [ring.middleware.anti-forgery :refer [wrap-anti-forgery]]
   [ring.middleware.webjars :refer [wrap-webjars]]
   [muuntaja.core :as muuntaja]
   [muuntaja.format.transit :as transit-format]
   [muuntaja.middleware :refer [wrap-format wrap-params]]
   [ring.middleware.flash :refer [wrap-flash]]
   [immutant.web.middleware :refer [wrap-session]]
   [ring.middleware.defaults :refer [site-defaults wrap-defaults]])
  (:import
   [javax.servlet ServletContext]))

(defn wrap-context [handler]
  (fn [request]
    (binding [*app-context*
              (if-let [context (:servlet-context request)]
                ;; If we're not inside a servlet environment
                ;; (for example when using mock requests), then
                ;; .getContextPath might not exist
                (try (.getContextPath ^ServletContext context)
                     (catch IllegalArgumentException _ context))
                ;; if the context is not specified in the request
                (:app-context {}))]
      (handler request))))

(defn wrap-internal-error [handler]
  (fn [req]
    (try
      (handler req)
      (catch Throwable t
        (log/error t (.getMessage t))
        (error-page
         {:status 500
          :title "Server error"
          :message "An error occurred and has been logged. Please contact support for any urgent requests."})))))

(defn wrap-csrf [handler]
  (wrap-anti-forgery
    handler
    {:error-response
     (error-page
       {:status 403
        :title "Session Token Expired"
        :message "The session has expired. If you have entered any information on the previous page, please copy it and then reload the page before re-entering the form."})}))

(def restful-format-options
  (update
    muuntaja/default-options
    :formats
    merge
    {"application/transit+json"
     {:decoder [(partial transit-format/decoder :json)]
      :encoder [(partial transit-format/encoder :json)]}}))

(defn wrap-formats [handler]
  (let [wrapped (-> handler wrap-params (wrap-format restful-format-options))]
    (fn [request]
      ;; disable wrap-formats for websockets
      ;; since they're not compatible with this middleware
      ((if (:websocket? request) handler wrapped) request))))

(defn wrap-base [handler]
  (-> handler
      wrap-webjars
      wrap-flash
      (wrap-session {:cookie-attrs {:http-only true}})
      (wrap-defaults
        (-> site-defaults
            (assoc-in [:security :anti-forgery] false)
            (dissoc :session)))
      wrap-context
      wrap-internal-error))
