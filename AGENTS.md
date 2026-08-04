# Units

**Stack**: KMP library. Type-safe physical unit definitions and conversions.

> **Full docs**: [areaassist/units/.ai/](.ai/)

## Critical Rules

1. New unit types must inherit from `Units` and provide a `UnitStore` enum for serialization
2. Maintain consistency with established operator overloading patterns (`*`, `/`, `in`, `as`)
3. Target Java 21 for JVM-based outputs

## Build

```bash
./gradlew build
./gradlew test
```
