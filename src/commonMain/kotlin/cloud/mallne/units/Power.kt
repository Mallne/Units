package cloud.mallne.units

import kotlinx.serialization.Serializable

open class Power(suffix: String, ratio: Double = 1.0, databasePrimitive: String) :
    Units(suffix, ratio, databasePrimitive) {
    operator fun div(other: Power) = ratio / other.ratio

    companion object {
        val milliwatts = Power("mW", 1000.0, "milliwatts")
        val watts = Power("W", databasePrimitive = "watts")
        val kilowatts = Power("kW", 0.001, "kilowatts")
        val megawatts = Power("MW", 0.000001, "megawatts")
        val gigawatts = Power("GW", 0.000000001, "gigawatts")

        @Serializable
        enum class UnitStore(override val unit: Power) : IUnitStore<Power> {
            MILLIWATTS(milliwatts),
            WATTS(watts),
            KILOWATTS(kilowatts),
            MEGAWATTS(megawatts),
            GIGAWATTS(gigawatts),
        }
    }
}