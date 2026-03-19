# Units

## Project Overview

**Units** is a robust, type-safe Kotlin Multiplatform library designed for handling units of measurement. It is part of
the "DiCentra Application Framework" and provides a natural, DSL-like interface for defining and converting physical
quantities.

### Core Technologies

- **Language:** Kotlin
- **Framework:** Kotlin Multiplatform (KMP)
- **Serialization:** kotlinx.serialization
- **Build System:** Gradle (Kotlin DSL)

### Key Features

- **Type-Safe Measures:** Uses `Measure<T : Units>` to ensure compile-time safety when performing arithmetic operations
  on different physical quantities.
- **Arithmetic Support:** Comprehensive operator overloading for unit multiplication, division, addition, subtraction,
  and reciprocal calculations.
- **SI and Other Systems:** Out-of-the-box support for:
    - **Physical:** Length, Mass, Area, Volume, Time, Temperature, Pressure, Work.
    - **Abstract/Specialized:** Angle, BinarySize, GraphicsLength, Probability, WoodVolume.
- **Target Platforms:** JVM, Android, JS (Node.js/Browser), WasmJS, iOS (X64, Arm64, SimulatorArm64), Linux X64.

---

## Building and Running

The project uses Gradle for builds and dependency management.

- **Build Project:**
  ```bash
  ./gradlew build
  ```
- **Run Tests:**
  ```bash
  ./gradlew test
  ```
- **Publish to Maven Repository:**
  ```bash
  ./gradlew publish
  ```
  *(Requires `dc.username` and `dc.password` to be set in local properties or environment variables.)*

---

## Development Conventions

### Architecture and Coding Style

- **Multiplatform Structure:** Source code is primarily located in `src/commonMain/kotlin` to ensure cross-platform
  compatibility.
- **Unit Definitions:** Each unit type (e.g., `Length`, `Time`) is an `open class` inheriting from `Units`. Specific
  units (e.g., `meters`, `seconds`) are defined as properties within their respective companion objects or as static
  objects.
- **Operator Overloading:** Use of operators like `*` and `/` is encouraged for creating measures (e.g., `5 * meters`)
  and performing unit math.
- **Unit Conversions:** Conversions are handled via the `in` and `as` infix functions (e.g., `length in meters`,
  `length as feet`).
- **Precision:** Numerical extensions in `NumericalExtensions.kt` provide methods for rounding and cleaning up numeric
  strings.

### Contribution Guidelines

- Ensure that any new unit types inherit from `Units` and provide a `UnitStore` enum for serialization support.
- Maintain consistency with the established operator overloading patterns for unit math.
- Target Java 21 for JVM-based outputs.
