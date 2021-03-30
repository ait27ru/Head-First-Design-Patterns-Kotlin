package devices

class Stereo(private val location: String) {

    private var volume: Int = 0

    fun on(){
        println("$location Stereo On")
    }

    fun off() {
        println("$location Stereo Off")
    }

    @JvmName("setVolume1")
    fun setVolume(volume: Int) {
        this.volume = volume
        println("$location Stereo Set Volume level $volume")
    }

    fun setCD() {
        println("$location Stereo Set CD")
    }
}