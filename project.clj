(defproject gamers "1.2.3"
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild {
    :builds [{
        :source-paths ["src/main/cljs"]
        :compiler {
          :output-to "src/main/webapp/js/gamers.js"
          :optimizations :whitespace
          :pretty-print true}}]}
  :source-paths ["src" "src/main/clojure"]
  :dependencies [[org.clojure/algo.monads "0.1.0"]])