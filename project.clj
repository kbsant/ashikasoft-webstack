(defproject ashikasoft/webstack "0.1.1-SNAPSHOT"

  :description "Base web stack"
  :url "https://github.com/kbsant/ashikasoft-webstack"

  :dependencies [[buddy/buddy-auth "2.2.0"]
                 [buddy/buddy-hashers "1.4.0"]
                 [clj-time "0.15.2"]
                 [cljs-ajax "0.8.0":exclusions [cheshire]]
                 [com.cognitect/transit-java "0.8.337"]
                 [cprop "0.1.14"]
                 [integrant "0.7.0"]
                 [luminus-immutant "0.2.5"]
                 [luminus-nrepl "0.1.6"]
                 [luminus/ring-ttl-session "0.3.3"]
                 [metosin/muuntaja "0.6.4"]
                 [metosin/reitit "0.3.9"]
                 [metosin/ring-http-response "0.9.1"]
                 [com.fasterxml.jackson.core/jackson-core "2.9.5"]
                 [org.apache.commons/commons-text "1.8"]
                 [org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "0.4.500"]
                 [org.clojure/data.codec "0.1.1"]
                 [org.clojure/tools.cli "0.4.2"]
                 [org.clojure/tools.logging "0.5.0"]
                 [org.webjars.bower/tether "1.4.4"]
                 [org.webjars/bootstrap "4.1.1"]
                 [org.webjars/font-awesome "5.10.1"]
                 [org.webjars/webjars-locator "0.37"]
                 [reagent "0.8.1"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-defaults "0.3.2"]]

  :source-paths ["src/clj" "src/cljc"]
  :min-lein-version "2.0.0"
  )
