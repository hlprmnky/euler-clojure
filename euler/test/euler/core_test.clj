(ns euler.core-test
  (:use clojure.test
        euler.core))

(deftest test-problem-001
  (testing "Problem 001 - Add all natural numbers < 1000 that are divisible by 3 or 5"
    (is (= 166833 (problem-001)))))
