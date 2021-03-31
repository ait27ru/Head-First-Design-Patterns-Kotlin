package facadeExample.devices

class PopcornPopper {
    fun on() {
        println("${this.javaClass.simpleName} on")
    }
    fun off() {
        println("${this.javaClass.simpleName} off")
    }
}