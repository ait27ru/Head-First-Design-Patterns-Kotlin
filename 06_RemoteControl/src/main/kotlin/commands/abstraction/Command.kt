package commands.abstraction

interface Command {
    fun execute()
    fun undo()
}