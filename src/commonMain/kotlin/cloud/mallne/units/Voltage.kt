package cloud.mallne.units

import kotlinx.serialization.Serializable

open class Voltage(suffix: String, ratio: Double = 1.0, databasePrimitive: String) :
    Units(suffix, ratio, databasePrimitive) {
    operator fun div(other: Voltage) = ratio / other.ratio

    companion object {
        val millivolts = Voltage("mV", 1000.0, "millivolts")
        val volts = Voltage("V", databasePrimitive = "volts")
        val kilovolts = Voltage("kV", 0.001, "kilovolts")
        val megavolts = Voltage("MV", 0.000001, "megavolts")

        @Serializable
        enum class UnitStore(override val unit: Voltage) : IUnitStore<Voltage> {
            MILLIVOLTS(millivolts),
            VOLTS(volts),
            KILOVOLTS(kilovolts),
            MEGAVOLTS(megavolts),
        }
    }
}