(ns kotoba.capability.clock.monotonic
  "Importable contract for clock/monotonic."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "clock/monotonic"))
