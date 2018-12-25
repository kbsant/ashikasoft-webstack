(ns ashikasoft.webstack.util.core-test
  (:require
   [ashikasoft.webstack.util.core :refer :all]
   [clojure.string :as string]
   [clojure.test :refer :all]))

(deftest test-interpolate
  (testing "Interpolate a single entry."
    (is (= "Rubberduckyyou'resofine"
           (interpolate "Rubber{:x}you'resofine" {:x "ducky"}))))
  (testing "Interpolate multiple entries."
    (is (= "Rubberducky you're so fine number 9"
           (interpolate "Rubber{:x} you're {:y} number {:z}"
                        {:x 'ducky :y "so fine" :z 9}))))
  (testing "Interpolate nested entries."
    (is (= "Rubber ducky you're so fine"
           (interpolate "{:fragment} you're {:predicate}"
                        {:animal "duck"
                         :material "Rubber"
                         :adj "fine"
                         :adj-modifier "so"
                         :noun-modifier "{:material}"
                         :noun-suffix "y"
                         :noun "{:animal}{:noun-suffix}"
                         :fragment "{:noun-modifier} {:noun}"
                         :predicate "{:adj-modifier} {:adj}"}))))
  (testing "Interpolate without entries."
    (is (= "Rubbergatoryou'resofine"
           (interpolate "Rubbergatoryou'resofine" {:x "ducky"}))))
  (testing "Skip interpolation if a key is missing."
    (is (= "Rubber{:x}you'resofine"
           (interpolate "Rubber{:x}you'resofine" {:z "ducky"}))))
  (testing "Skip interpolation of the map is nil."
    (is (= "Rubber{:x}you'resofine"
           (interpolate "Rubber{:x}you'resofine" nil)))))
