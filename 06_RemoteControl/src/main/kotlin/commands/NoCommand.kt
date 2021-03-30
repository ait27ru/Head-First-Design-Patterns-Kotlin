package commands

import commands.abstraction.Command

class NoCommand : Command {
    override fun execute() { }
    override fun undo() { }
}