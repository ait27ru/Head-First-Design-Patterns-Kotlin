package commands

import commands.abstraction.Command
import devices.Light

class LightOffCommand(private var light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}