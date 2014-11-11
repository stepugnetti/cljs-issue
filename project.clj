(defproject cljs-issue "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "bare"
              :source-paths ["src/bare"]
              :compiler {
                :output-to "target/cljs_issue_bare.js"
                :output-dir "out_bare"
                :optimizations :none
                :source-map true}}
             {:id "wrapped"
              :source-paths ["src/wrapped"]
              :compiler {
                :output-to "target/cljs_issue_wrapped.js"
                :output-dir "out_wrapped"
                :optimizations :none
                :source-map true}}]})
