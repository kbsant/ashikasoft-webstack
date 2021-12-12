(defproject ashikasoft/webstack "0.1.7-SNAPSHOT"

  :description "Base web stack"
  :url "https://github.com/kbsant/ashikasoft-webstack"

  :dependencies [[buddy/buddy-auth "3.0.1"]
                 [buddy/buddy-hashers "1.8.1"]
                 [cljs-ajax "0.8.4" :exclusions [cheshire]]
                 [com.cognitect/transit-java "1.0.343"]
                 [cprop "0.1.19"]
                 [integrant "0.8.0"]
                 [luminus-immutant "0.2.5"]
                 [luminus-nrepl "0.1.7"]
                 [luminus/ring-ttl-session "0.3.3"]
                 [metosin/muuntaja "0.6.8"]
                 [metosin/reitit "0.5.15"]
                 [metosin/ring-http-response "0.9.3"]
                 [com.fasterxml.jackson.core/jackson-core "2.13.0"]
                 [org.apache.commons/commons-text "1.9"]
                 [org.clojure/clojure "1.10.3"]
                 [org.clojure/core.async "1.5.644"]
                 [org.clojure/data.codec "0.1.1"]
                 [org.clojure/tools.cli "1.0.206"]
                 [org.clojure/tools.logging "1.2.1"]
                 [org.webjars.bower/tether "1.4.4"]
                 [org.webjars/bootstrap "5.1.3"]
                 [org.webjars/font-awesome "5.15.4"]
                 [org.webjars/webjars-locator "0.42"]
                 [reagent "1.1.0"]
                 [cljsjs/react "17.0.2-0"]
                 [cljsjs/react-dom "17.0.2-0"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.9.4"]
                 [ring/ring-defaults "0.3.3"]]

  :source-paths ["src/clj" "src/cljc"]
  :min-lein-version "2.0.0"
  )
