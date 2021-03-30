package devices

class GarageDoor(private val location: String) {

    fun up() {
        println("$location Garage door is Up")
    }

    fun down() {
        println("$location Garage door is Down")
    }

    fun stop() {
        println("$location Garage door is Stopped")
    }

    fun lightOn() {
        println("$location Garage door Light is On")
    }

    fun lightOff() {
        println("$location Garage door Light is Off")
    }
}