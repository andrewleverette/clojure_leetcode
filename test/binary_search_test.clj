(ns binary-search-test
  (:require [clojure.test :refer [deftest testing is]]
            [clojure-leetcode.binary-search :refer [binary-search]]))

(deftest invalid-input-tests
  (testing "An empty or nil collection should return nil"
    (is (nil? (binary-search [] 1)))
    (is (nil? (binary-search nil 1))))
  (testing "A nil target should return nil"
    (is (nil? (binary-search [1 2 3] nil)))))

(deftest binary-search-tests

  (testing "Simple collection tests"
    (is (= (binary-search [1 3 5 7 9] 1) 0))
    (is (= (binary-search [1 3 5 7 9] 5) 2))
    (is (= (binary-search [1 3 5 7 9] 9) 4))
    (is (= (binary-search [1 3 5 7 9] 4) nil))); Element 4 is not present

  (testing "Negative number collection tests"
    (is (= (binary-search [-10 -5 0 5 10] -5) 1))
    (is (= (binary-search [-10 -5 0 5 10] 0) 2)))

  (testing "Large collection tests"
    (is (= (binary-search (range 1 10001) 5000) 4999))
    (is (= (binary-search (range 1 10001) 10000) 9999))))
