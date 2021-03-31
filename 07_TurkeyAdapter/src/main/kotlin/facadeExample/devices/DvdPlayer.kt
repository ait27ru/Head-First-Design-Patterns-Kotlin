package facadeExample.devices

class DvdPlayer {
    fun on() {
        println("${this.javaClass.simpleName} on")
    }
    fun off() {
        println("${this.javaClass.simpleName} off")
    }
}