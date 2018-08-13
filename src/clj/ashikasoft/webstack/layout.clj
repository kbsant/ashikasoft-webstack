(ns ashikasoft.webstack.layout
  (:require
    [ashikasoft.webstack.view.error :as view.error]
    [ring.util.http-response :refer [content-type ok]]
    [ring.middleware.anti-forgery :refer [*anti-forgery-token*]]))

;; This was originally from the Luminus template and is used with middleware.clj
(declare ^:dynamic *app-context*)

(defn render-text [text]
  (content-type (ok text) "text/plain; charset=utf-8"))

(defn render-hiccup [hiccup-fn params]
  (content-type
    (ok
      (hiccup-fn
        (assoc params
           :csrf-token *anti-forgery-token*
           :servlet-context *app-context*)))
    "text/html; charset=utf-8"))

(defn error-page
  [{:keys [status] :as details}]
  {:status  status
   :headers {"Content-Type" "text/html; charset=utf-8"}
   :body    (view.error/render {:glossary details})})

