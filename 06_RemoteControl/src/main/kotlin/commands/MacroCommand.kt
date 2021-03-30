package commands

import commands.abstraction.Command

class MacroCommand(private val commands: Array<Command>) : Command {

    override fun execute() {
        commands.forEach { it.execute() }
    }

    override fun undo() {
        commands.forEach { it.undo() }
    }
}