(ns euler.core)

(defn problem-001
  (reduce + (filter (or #(= (mod % 3) 0) #(= (mod % 5) 0)) (range 1 1000))))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
