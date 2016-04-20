(ns getyx.core)


;; def a as 2 and uses a to def b
(def a 2)
(def b (+ 40 a))

;; since it's using before declaration you need to
;; declare it first, because clojure compile as runing
;; code in the REPL
(declare get-y)
(defn get-x []
  (+ (get-y) 4))
(defn get-y []
  38)

(defn fire!!! [are-you-ready?]
  (if are-you-ready?
    (println "FIREEEEEEE!!!!")
    (println "Nops...")))

(fire!!! true)
(fire!!! false)