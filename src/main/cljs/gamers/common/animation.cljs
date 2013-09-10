(ns gamers.common.animation)

(defn animate []
  (str "animating"))

(defn movex [element x speed & options]
  (str "moving " element " to position : " x " with speed: " speed " options : " options))