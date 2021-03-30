package devices

class CeilingFan(private val location: String) {
    private var ceilingFanSpeed : FanSpeed = FanSpeed.OFF

    fun off() {
        ceilingFanSpeed = FanSpeed.OFF
        println("$location Ceiling Fan is Off")
    }

    fun low() {
        ceilingFanSpeed = FanSpeed.LOW
        println("$location Ceiling Fan is On - ${ceilingFanSpeed.name}")
    }

    fun medium() {
        ceilingFanSpeed = FanSpeed.MEDIUM
        println("$location Ceiling Fan is On - ${ceilingFanSpeed.name}")
    }

    fun high() {
        ceilingFanSpeed = FanSpeed.HIGH
        println("$location Ceiling Fan is On - ${ceilingFanSpeed.name}")
    }

    fun getSpeed(): FanSpeed{
        return ceilingFanSpeed
    }
}