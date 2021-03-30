package commands

import commands.abstraction.Command
import devices.Stereo

class StereoOnWithCdCommand (private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }

    override fun undo() {
        stereo.off()
    }
}