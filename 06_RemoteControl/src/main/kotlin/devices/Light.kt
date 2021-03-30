package devices

class Light(private val location: String) {
    fun on() {
        println("$location Light is On")
    }
    fun off() {
        println("$location Light is Off")
    }
}