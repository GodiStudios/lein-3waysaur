(ns leiningen.lein-3waysaur-test
  (:require [clojure.test :refer :all]
            [leiningen.lein-3waysaur :refer :all]))

(deftest intro-func
  (testing "if the base test lib is working for a better developer experience"
    (is (= "Hello, 3waysaur!" (lein-3waysaur nil nil)))))
