(ns euler.core)

(defn- divisible-by? [dividend divisor]
  (= (mod dividend divisor) 0))

(defn problem-001 []
  (reduce + (filter (or 
                      #(divisible-by? % 3)
                      #(divisible-by? % 5))
                      (range 1 1000))))
