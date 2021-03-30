package commands

import commands.abstraction.Command
import devices.GarageDoor

class GarageDoorOpenCommand(private val garageDoor: GarageDoor) : Command {

    override fun execute() {
        garageDoor.lightOn()
        garageDoor.up()
        garageDoor.stop()
    }

    override fun undo() {
        garageDoor.down()
        garageDoor.stop()
        garageDoor.lightOff()
    }
}