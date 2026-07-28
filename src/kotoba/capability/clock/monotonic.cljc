(ns kotoba.capability.clock.monotonic
  "Importable contract for clock/monotonic.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:clock-monotonic}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z25t4k7snnY6CkuSJY2JCK4SANe2L", :capability/repository "kotoba-lang/capability-clock-monotonic", :capability/id "clock/monotonic", :capability/effects #{:clock}, :capability/provider-status :contract-only})
