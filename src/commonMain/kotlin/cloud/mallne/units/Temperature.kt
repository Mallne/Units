package cloud.mallne.units

/**
 * Units to measure time durations.
 */
open class Temperature(suffix: String, ratio: Double = 1.0, databasePrimitive: String) :
    Units(suffix, ratio, databasePrimitive) {
    operator fun div(other: Temperature) = ratio / other.ratio

    companion object {
        val celsius = Temperature("°C", databasePrimitive = "celsius")

        enum class UnitStore(
            override val unit: Temperature,
        ) : IUnitStore<Temperature> {
            CELSIUS(unit = celsius),
        }
    }
}