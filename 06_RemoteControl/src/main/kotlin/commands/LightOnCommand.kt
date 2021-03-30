package commands

import commands.abstraction.Command
import devices.Light

class LightOnCommand(private var light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}