# java_lazy_loading

Concise demo to observe JVM lazy class loading and initialization using `-verbose:class`.

### Objective

See when the JVM loads classes by running a minimal program with class-loading verbosity.

### Build

- Compile sources:

```sh
make build
```

- Run with class-loading tracing:

```sh
make run
```

- Inspect `output.log` for "[Loaded ...]" messages and compare them to program prints.
