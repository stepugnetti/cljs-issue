(ns cljs-issue.bare
  (:require [cljs.reader :refer [read-string]]))

(defn issue []
  (let [rs (read-string "1")]
    (< rs 1)))
