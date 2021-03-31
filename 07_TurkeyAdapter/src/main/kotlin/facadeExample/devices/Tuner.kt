package facadeExample.devices

class Tuner {
    fun on() {
        println("${this.javaClass.simpleName} on")
    }
    fun off() {
        println("${this.javaClass.simpleName} off")
    }
}