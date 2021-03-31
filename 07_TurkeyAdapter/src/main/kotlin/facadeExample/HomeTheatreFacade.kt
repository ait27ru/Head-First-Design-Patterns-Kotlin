package facadeExample

import facadeExample.devices.*

class HomeTheatreFacade(
    private val amplifier: Amplifier,
    private val dvdPlayer: DvdPlayer,
    private val popcornPopper: PopcornPopper,
    private val screen: Screen,
    private val theatreLights: TheatreLights,
    private val tuner: Tuner) {

    fun watchMovie(movie: String) {
        println("Get ready to watch '$movie'...")
        amplifier.on()
        dvdPlayer.on()
        popcornPopper.on()
        screen.on()
        theatreLights.on()
        tuner.on()
    }

    fun endMovie() {
        println("Shutting movie theatre down...")
        amplifier.off()
        dvdPlayer.off()
        popcornPopper.off()
        screen.off()
        theatreLights.off()
        tuner.off()
    }
}