import commands.NoCommand
import commands.abstraction.Command

class RemoteControlWithUndo (private val numberOfSlots: Int) {

    private var onCommands = Array<Command>(numberOfSlots) { NoCommand() }
    private var offCommands = Array<Command>(numberOfSlots) { NoCommand() }
    private var undoCommand: Command = NoCommand()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        if(slotOutOfRange(slot))
            return
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        if(slotOutOfRange(slot))
            return
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        if(slotOutOfRange(slot))
            return
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPressed() {
        undoCommand.undo()
    }

    private fun slotOutOfRange(slot: Int): Boolean {
        return slot !in 0 until numberOfSlots
    }

    override fun toString(): String {
        return buildString {
            append("\n------ Remote Control ------\n")
            for (i in 0 until numberOfSlots){
                append("[slot $i]\t${onCommands[i].javaClass.simpleName}\t${offCommands[i].javaClass.simpleName}\n")
            }
            append("[undo]\t${undoCommand.javaClass.simpleName}\n")
        }
    }
}