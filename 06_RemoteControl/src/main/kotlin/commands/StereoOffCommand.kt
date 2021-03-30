package commands

import commands.abstraction.Command
import devices.Stereo

class StereoOffCommand (private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }
}