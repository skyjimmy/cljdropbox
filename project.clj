(defproject cljdropbox "0.4.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "2.0.1"]
                 [cheshire "5.5.0"]]
  :main cljdropbox.core
  :profiles {:uberjar {:aot :all}})
                
