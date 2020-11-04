(defproject bel-use-learn-lib "0.1.0-SNAPSHOT"
  :description "example of usage of bel-learn-lib"
  :url "https://github.com/bennoloeffler/bel-use-learn-lib"
  :license {:name "WTFPL"
            :url "http://www.wtfpl.net/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot bel-use-learn-lib.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
