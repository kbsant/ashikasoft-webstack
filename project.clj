(defproject ashikasoft/webstack "0.1.0-SNAPSHOT"

  :description "Base web stack"
  :url "https://github.com/kbsant/ashikasoft-webstack"

  :dependencies [[buddy/buddy-auth "2.1.0"]
                 [buddy/buddy-hashers "1.3.0"]
                 [clj-time "0.14.4"]
                 [cljs-ajax "0.7.4":exclusions [cheshire]]
                 [com.cognitect/transit-java "0.8.332"]
                 [cprop "0.1.11"]
                 [integrant "0.6.3"]
                 [luminus-immutant "0.2.4"]
                 [luminus-nrepl "0.1.5"]
                 [luminus/ring-ttl-session "0.3.2"]
                 [metosin/muuntaja "0.5.0"]
                 [metosin/reitit "0.1.3"]
                 [metosin/ring-http-response "0.9.0"]
                 [com.fasterxml.jackson.core/jackson-core "2.9.5"]
                 [org.apache.commons/commons-text "1.4"]
                 [org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "0.4.474"]
                 [org.clojure/data.codec "0.1.1"]
                 [org.clojure/tools.cli "0.3.7"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.webjars.bower/tether "1.4.4"]
                 [org.webjars/bootstrap "4.1.1"]
                 [org.webjars/font-awesome "5.1.0"]
                 [org.webjars/webjars-locator "0.34"]
                 [reagent "0.8.1"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-defaults "0.3.2"]]

  :source-paths ["src/clj" "src/cljc"]
  :min-lein-version "2.0.0"
  :plugins [[lein-ancient "0.6.15"]])
