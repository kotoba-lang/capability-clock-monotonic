(ns kotoba.capability.clock.monotonic-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.clock.monotonic :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
