package cloud.mallne.units

import kotlinx.serialization.Serializable

open class ElectricCurrent(suffix: String, ratio: Double = 1.0, databasePrimitive: String) :
    Units(suffix, ratio, databasePrimitive) {
    operator fun div(other: ElectricCurrent) = ratio / other.ratio

    companion object {
        val microamps = ElectricCurrent("µA", 1e6, "microamps")
        val milliamps = ElectricCurrent("mA", 1000.0, "milliamps")
        val amps = ElectricCurrent("A", databasePrimitive = "amps")
        val kiloamps = ElectricCurrent("kA", 0.001, "kiloamps")

        @Serializable
        enum class UnitStore(override val unit: ElectricCurrent) : IUnitStore<ElectricCurrent> {
            MICROAMPS(microamps),
            MILLIAMPS(milliamps),
            AMPS(amps),
            KILOAMPS(kiloamps),
        }
    }
}