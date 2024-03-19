(defproject ashikasoft/webstack "0.1.8-SNAPSHOT"

  :description "Base web stack"
  :url "https://github.com/kbsant/ashikasoft-webstack"

  :dependencies [[buddy/buddy-auth "3.0.323"]
                 [buddy/buddy-hashers "2.0.167"]
                 [cljs-ajax "0.8.4" :exclusions [cheshire]]
                 [com.cognitect/transit-java "1.0.371"]
                 [cprop "0.1.20"]
                 [integrant "0.8.1"]
                 [luminus-immutant "0.2.5"]
                 [luminus-nrepl "0.1.7"]
                 [luminus/ring-ttl-session "0.3.3"]
                 [metosin/muuntaja "0.6.10"]
                 [metosin/reitit "0.7.0-alpha7"]
                 [metosin/ring-http-response "0.9.3"]
                 [com.fasterxml.jackson.core/jackson-core "2.17.0"]
                 [org.apache.commons/commons-text "1.11.0"]
                 [commons-io/commons-io "2.15.1"]
                 [org.clojure/clojure "1.11.2"]
                 [org.clojure/core.async "1.6.681"]
                 [org.clojure/data.codec "0.2.0"]
                 [org.clojure/tools.cli "1.1.230"]
                 [org.clojure/tools.logging "1.3.0"]
                 [org.webjars.bower/tether "1.4.7"]
                 [org.webjars/bootstrap "5.2.0"]
                 [org.webjars/font-awesome "6.1.2"]
                 [org.webjars/webjars-locator "0.52"]
                 [reagent "1.2.0"]
                 [cljsjs/react "18.2.0-1"]
                 [cljsjs/react-dom "18.2.0-1"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.12.0"]
                 [ring/ring-defaults "0.4.0"]]

  :source-paths ["src/clj" "src/cljc"]
  :min-lein-version "2.0.0"
  )
