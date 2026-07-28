# capability-clock-monotonic

Atomic authority package for `clock/monotonic`.

- imports: `#{:clock-monotonic}`
- effects: `#{:clock}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
