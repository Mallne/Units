package cloud.mallne.units

import kotlinx.serialization.Serializable

/**
 * Units to measure time durations.
 */
open class Temperature(suffix: String, ratio: Double = 1.0, databasePrimitive: String) :
    Units(suffix, ratio, databasePrimitive) {
    operator fun div(other: Temperature) = ratio / other.ratio

    companion object {
        val celsius = Temperature("°C", databasePrimitive = "celsius")

        @Serializable
        enum class UnitStore(
            override val unit: Temperature,
        ) : IUnitStore<Temperature> {
            CELSIUS(unit = celsius),
        }
    }
}