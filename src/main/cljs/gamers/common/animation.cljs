(ns gamers.common.animation
  "Library to do all kinds of animations on html elements")

(def not-nil? (complement nil?))

(defn has-attr? [element attr]
  (not-nil? (aget element attr)))

(defn has-anyof?
  "Checks if key is present in element as an attribute"
  [element keys]
  (some #(has-attr? element %) keys))

(defn transition-prefix
  "Identifies the browser specific transition prefix"
  []
  (let [style (-> js/document .-body .-style)]
    (cond
      (has-attr? style "webkitTransition") "webkitTransition"
      (has-attr? style "MozTransition") "MozTransition"
      :else "transition")))


(defn supports3d?
  "Checks if 3d is supported by the browser"
  []
  (has-anyof? (-> js/document .-body .-style) ["perspective" "WebkitPerspective"]))


(defn transform-supported?
  "Checkes if transform (CSS3 feature) is supported by the browser context"
  []
  (has-anyof? (-> js/document .-body .-style) ["perspective" "WebkitPerspective"]))

(defn animate []
  (str "animating"))

(defn movex [element x speed & options]
  (str "moving " element " to position : " x " with speed: " speed " options : " options))