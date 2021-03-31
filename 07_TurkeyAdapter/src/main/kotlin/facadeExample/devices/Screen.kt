package facadeExample.devices

class Screen {
    fun on() {
        println("${this.javaClass.simpleName} on")
    }
    fun off() {
        println("${this.javaClass.simpleName} off")
    }
}