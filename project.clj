(defproject ashikasoft/webstack "0.1.0-SNAPSHOT"

  :description "Base web stack"
  :url "http://www.ashikasoft.com"

  :dependencies [[clj-time "0.14.4"]
                 [cljs-ajax "0.7.4"]
                 [com.cognitect/transit-java "0.8.332"]
                 [cprop "0.1.11"]
                 [crypto-password "0.2.0"]
                 [integrant "0.6.3"]
                 [luminus-immutant "0.2.4"]
                 [luminus-nrepl "0.1.4"]
                 [luminus/ring-ttl-session "0.3.2"]
                 [metosin/muuntaja "0.5.0"]
                 [metosin/reitit "0.1.3"]
                 [metosin/ring-http-response "0.9.0"]
                 [org.apache.commons/commons-text "1.4"]
                 [org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]
                 [org.clojure/data.codec "0.1.1"]
                 [org.clojure/tools.cli "0.3.7"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.webjars.bower/tether "1.4.4"]
                 [org.webjars/bootstrap "4.1.1"]
                 [org.webjars/font-awesome "5.1.0"]
                 [org.webjars/webjars-locator "0.34"]
                 [ring-webjars "0.2.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-defaults "0.3.2"]]

  :min-lein-version "2.0.0"
  
  :source-paths ["src/clj" "src/cljc"]
  :target-path "target/%s/"

  :plugins [[lein-ancient "0.6.15"]]
  :clean-targets ^{:protect false}
  [:target-path [:builds :app :compiler :output-dir] [:builds :app :compiler :output-to]])
