(ns gamers.monads
  (:use clojure.contrib.monads))

(defn m-bind [value function]
  (function value))

