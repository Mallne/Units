# Commands and Environment -- AreaAssist Units

## Scripts

```bash
# Build the project
./gradlew build

# Run tests
./gradlew test

# Publish to Maven repository
./gradlew publish
```

## Local Dev Setup

1. Ensure JDK 21 is installed
2. Run `./gradlew build` from the `areaassist/units/` directory
3. Run `./gradlew test` to verify all targets pass

## Environment Variables

| Variable | Purpose | Default |
|----------|---------|---------|
| `dc.username` | Maven registry username (for publish) | Required for publish |
| `dc.password` | Maven registry password (for publish) | Required for publish |

## Runtime Notes

- Publishing requires `dc.username` and `dc.password` in local properties or environment variables.
