(ns cljs-issue.wrapped
  (:require [cljs.reader :refer [read-string]]))

(defn issue []
  (let [rs (identity (read-string "1"))]
    (< rs 1)))
