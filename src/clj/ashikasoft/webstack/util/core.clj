(ns ashikasoft.webstack.util.core
  (:require
   [clojure.string :as string]
   [clojure.pprint :as pprint]
   [cheshire.core :as json]))

(defn- interpolate-pass [xf s ks m]
  (reduce #(string/replace %1 (str "{" %2 "}") (xf (str (%2 m))))
           s
           (keys m)))

(defn interpolate
  "Given an optional transform function, a string and a map, interpolate the string
  with values from the map. The pattern {:keyname} will be replaced with values
  from the map."
  ([s m]
   (interpolate identity s m))
  ([xf s m]
   (let [ks (keys m)]
     (loop [interpolated s
            n (count ks)]
       (if (zero? n)
         interpolated
         (recur
          (interpolate-pass xf interpolated ks m)
          (dec n)))))))

(defmulti export-format (fn [format _] format))

(defmethod export-format "JSON" [_ data]
  (json/generate-string data {:pretty true}))

(defmethod export-format "EDN" [_ data]
  (pprint/write data :stream nil))

(defn resource-edn [path]
  (-> path clojure.java.io/resource slurp clojure.edn/read-string))
