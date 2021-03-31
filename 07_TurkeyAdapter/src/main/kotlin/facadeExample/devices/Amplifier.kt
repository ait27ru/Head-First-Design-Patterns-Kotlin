package facadeExample.devices

class Amplifier {
    fun on() {
        println("${this.javaClass.simpleName} on")
    }
    fun off() {
        println("${this.javaClass.simpleName} off")
    }
}