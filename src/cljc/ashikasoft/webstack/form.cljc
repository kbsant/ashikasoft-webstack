(ns ashikasoft.webstack.form
  (:require
    [clojure.string :as string]))

(defn navbar [contents]
  [:div.container.navbar contents])

(defn errors-div [errors]
  (when errors
    [:div
      (->> errors
        (map-indexed
          (fn [i error]
            ^{:key i}
            [:p.text-danger error])))]))

(defn anti-forgery-field [csrf-token]
  [:input.__anti-forgery-token
    {:name "__anti-forgery-token"
     :type :hidden
     :value csrf-token}])

(defn with-change-handler [m handler index]
  (cond-> m
    handler (assoc :on-change #(handler index %))))
