(ns clojurebox.core
  (:gen-class))

(defn add [x y]
  (+ x y))

(defn -main []
  (println "2 + 3 =" (add 2 3)))
