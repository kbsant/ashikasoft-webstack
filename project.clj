(defproject ashikasoft/webstack "0.1.8-SNAPSHOT"

  :description "Base web stack"
  :url "https://github.com/kbsant/ashikasoft-webstack"

  :dependencies [[buddy/buddy-auth "3.0.323"]
                 [buddy/buddy-hashers "1.8.158"]
                 [cljs-ajax "0.8.4" :exclusions [cheshire]]
                 [com.cognitect/transit-java "1.0.362"]
                 [cprop "0.1.19"]
                 [integrant "0.8.0"]
                 [luminus-immutant "0.2.5"]
                 [luminus-nrepl "0.1.7"]
                 [luminus/ring-ttl-session "0.3.3"]
                 [metosin/muuntaja "0.6.8"]
                 [metosin/reitit "0.5.18"]
                 [metosin/ring-http-response "0.9.3"]
                 [com.fasterxml.jackson.core/jackson-core "2.13.4"]
                 [org.apache.commons/commons-text "1.9"]
                 [org.clojure/clojure "1.11.1"]
                 [org.clojure/core.async "1.5.648"]
                 [org.clojure/data.codec "0.1.1"]
                 [org.clojure/tools.cli "1.0.206"]
                 [org.clojure/tools.logging "1.2.4"]
                 [org.webjars.bower/tether "1.4.7"]
                 [org.webjars/bootstrap "5.2.0"]
                 [org.webjars/font-awesome "6.1.2"]
                 [org.webjars/webjars-locator "0.45"]
                 [reagent "1.1.1"]
                 [cljsjs/react "18.2.0-0"]
                 [cljsjs/react-dom "18.2.0-0"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.9.5"]
                 [ring/ring-defaults "0.3.3"]]

  :source-paths ["src/clj" "src/cljc"]
  :min-lein-version "2.0.0"
  )
