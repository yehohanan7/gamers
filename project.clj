(defproject gamers "1.2.3"
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild {
    :builds [{
        ; The path to the top-level ClojureScript source directory:
        :source-paths ["src/main/cljs"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {
          :output-to "src/main/webapp/js/gamers.js"  ; default: target/cljsbuild-main.js
          :optimizations :whitespace
          :pretty-print true}}]}

  :source-paths ["src" "src/main/clojure"]

  :dependencies [[org.clojure/algo.monads "0.1.0"]])