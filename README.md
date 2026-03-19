# Mallne/Units

**Units** is a robust, type-safe, and natural-feeling Kotlin Multiplatform library for physical quantities and units
of measure.

[![Kotlin](https://img.shields.io/badge/kotlin-grey.svg?logo=kotlin)](https://kotlinlang.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Kotlin Multiplatform](https://img.shields.io/badge/Kotlin-Multiplatform-blue.svg?logo=kotlin)](https://kotlinlang.org/docs/multiplatform.html)

---

## 🚀 Overview

Handling physical units can be error-prone when using raw numbers. **DC-Units** eliminates these issues by providing a
type-safe system where units are part of the type signature. It's designed to feel like a natural extension of the
Kotlin language.

### Key Highlights

- **Type Safety:** You cannot accidentally add meters to seconds.
- **Natural Syntax:** Use operators like `*` and `/` to create measures (e.g., `5 * meters`).
- **Rich Unit Math:** Supports unit products (e.g., `Length * Length = Area`) and ratios (e.g.,
  `Length / Time = Velocity`).
- **Multiplatform:** Targets JVM, Android, iOS, JS, WasmJS, and Linux.
- **Serialization:** Built-in support for `kotlinx.serialization`.

---

## 🛠️ Installation

Add the DiCentra repository and the dependency to your `build.gradle.kts`:

```kotlin
repositories {
    maven("https://registry.mallne.cloud/repository/DiCentraArtefacts/")
}

dependencies {
    implementation("cloud.mallne:units:1.0.0-SNAPSHOT")
}
```

---

## 📖 Usage Examples

### Creating Measures

Creating a measure is as simple as multiplying a number by a unit.

```kotlin
val distance = 500 * meters
val duration = 2 * hours
val weight = 75.5 * kilograms
```

### Conversions

Easily convert between compatible units using the `in` or `as` infix functions.

```kotlin
val length = 1 * miles
val inMeters = length in meters    // Returns Double: 1609.344
val asFeet = length `as` feet      // Returns Measure<Length>: 5280.0 ft
```

### Arithmetic

Perform math while maintaining unit integrity.

```kotlin
val speed = (100 * kilometers) / (1 * hours) // Measure<Velocity>
val area = (5 * meters) * (10 * meters)      // Measure<Area>
val totalWeight = (500 * grams) + (1 * kilograms) // Result in grams: 1500.0 g
```

### Formatting

Print measures with their suffixes.

```kotlin
println(5 * meters) // Output: 5.0 m
println((25 * inches).toString(decimals = 1)) // Output: 25.0 in
```

---

## 📏 Supported Unit Categories

DC-Units provides comprehensive support for a wide range of measurements:

- **Length & Area:** `meters`, `kilometers`, `miles`, `inches`, `feet`, `hectares`, etc.
- **Time:** `seconds`, `minutes`, `hours`, `days`.
- **Mass:** `grams`, `kilograms`, `pounds`, `ounces`, `tons`.
- **Volume:** `liters`, `milliliters`, `gallons`, `cubicMeters`.
- **Environment:** `Temperature`, `Pressure`, `Humidity`.
- **Computing:** `BinarySize` (bytes, KB, MB, GB, etc.).
- **And more:** `Angle`, `Work`, `Probability`, `GraphicsLength`.

---

## 🤝 Contributing

Contributions are welcome! Whether it's adding new units, fixing bugs, or improving documentation, feel free to submit a
pull request.

---

## 📄 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.
