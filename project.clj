(defproject ashikasoft/webstack "0.1.1-SNAPSHOT"

  :description "Base web stack"
  :url "https://github.com/kbsant/ashikasoft-webstack"

  :dependencies [[buddy/buddy-auth "2.2.0"]
                 [buddy/buddy-hashers "1.7.0"]
                 [cljs-ajax "0.8.1":exclusions [cheshire]]
                 [com.cognitect/transit-java "1.0.343"]
                 [cprop "0.1.17"]
                 [integrant "0.8.0"]
                 [luminus-immutant "0.2.5"]
                 [luminus-nrepl "0.1.7"]
                 [luminus/ring-ttl-session "0.3.3"]
                 [metosin/muuntaja "0.6.7"]
                 [metosin/reitit "0.5.11"]
                 [metosin/ring-http-response "0.9.1"]
                 [com.fasterxml.jackson.core/jackson-core "2.12.1"]
                 [org.apache.commons/commons-text "1.9"]
                 [org.clojure/clojure "1.10.2-rc1"]
                 [org.clojure/core.async "1.3.610"]
                 [org.clojure/data.codec "0.1.1"]
                 [org.clojure/tools.cli "1.0.194"]
                 [org.clojure/tools.logging "1.1.0"]
                 [org.webjars.bower/tether "1.4.4"]
                 [org.webjars/bootstrap "4.1.1"]
                 [org.webjars/font-awesome "5.15.2"]
                 [org.webjars/webjars-locator "0.40"]
                 [reagent "1.0.0"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-defaults "0.3.2"]]

  :source-paths ["src/clj" "src/cljc"]
  :min-lein-version "2.0.0"
  )
