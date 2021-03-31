package facadeExample

import facadeExample.devices.*

fun main() {
    val homeTheatre = HomeTheatreFacade(
        Amplifier(),
        DvdPlayer(),
        PopcornPopper(),
        Screen(),
        TheatreLights(),
        Tuner()
    )

    homeTheatre.watchMovie("The Lord of the Ring")
    println()
    homeTheatre.endMovie()
}