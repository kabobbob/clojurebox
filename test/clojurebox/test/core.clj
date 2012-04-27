(ns clojurebox.test.core
  (:use [clojurebox.core])
  (:use [clojure.test]))

(deftest addition-test
  (is (= 5 (add 3 2)) "3 added to 2 should be 5"))
