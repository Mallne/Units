# Architecture -- AreaAssist Units

## Purpose

Units is a type-safe Kotlin Multiplatform library for handling units of measurement. It provides a DSL-like interface for defining and converting physical quantities with compile-time safety.

## Tech Stack

- **Language:** Kotlin Multiplatform (KMP)
- **Serialization:** kotlinx.serialization
- **Build:** Gradle Kotlin DSL

## Project Structure

```
areaassist/units/
+-- src/commonMain/kotlin/
    +-- Units.kt              # Base Units class
    +-- Measure.kt            # Measure<T : Units> type-safe wrapper
    +-- NumericalExtensions.kt # Rounding and numeric string utilities
    +-- units/                # Unit type definitions
        +-- Length.kt         # meters, feet, kilometers, etc.
        +-- Mass.kt           # grams, kilograms, pounds, etc.
        +-- Area.kt           # square meters, hectares, acres, etc.
        +-- Volume.kt         # liters, cubic meters, gallons, etc.
        +-- Time.kt           # seconds, minutes, hours, etc.
        +-- Temperature.kt    # celsius, fahrenheit, kelvin
        +-- Pressure.kt       # pascal, bar, psi, etc.
        +-- Angle.kt          # degrees, radians, grads
        +-- BinarySize.kt     # bytes, kilobytes, megabytes, etc.
        +-- WoodVolume.kt     # Festmeter, Raummeter (forestry units)
        +-- ...               # Additional unit types
```

## Unit System

Each unit type is an `open class` inheriting from `Units`. Specific units (e.g., `meters`, `seconds`) are properties within companion objects.

### Supported Systems

- **Physical**: Length, Mass, Area, Volume, Time, Temperature, Pressure, Work
- **Abstract/Specialized**: Angle, BinarySize, GraphicsLength, Probability, WoodVolume

## Operator Patterns

```kotlin
val length = 5 * meters           // Create a measure
val area = length * (3 * meters)  // Unit multiplication
val time = 10 * seconds           // Time measure
val speed = length / time         // Unit division
val converted = length in feet    // Unit conversion (infix)
val asFeet = length as feet       // Unit conversion (as)
```

## Dependencies on Other Modules

- None (standalone library)

## Non-negotiable Rules

- New unit types must inherit from `Units` and provide a `UnitStore` enum for serialization
- Maintain consistency with established operator overloading patterns
- Target Java 21 for JVM-based outputs
