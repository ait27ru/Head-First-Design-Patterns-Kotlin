package commands

import commands.abstraction.Command
import devices.GarageDoor

class GarageDoorCloseCommand(private val garageDoor: GarageDoor) : Command {

    override fun execute() {
        garageDoor.down()
        garageDoor.stop()
        garageDoor.lightOff()
    }

    override fun undo() {
        garageDoor.lightOn()
        garageDoor.up()
        garageDoor.stop()
    }
}