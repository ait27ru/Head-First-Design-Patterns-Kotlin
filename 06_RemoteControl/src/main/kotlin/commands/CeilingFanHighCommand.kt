package commands

import commands.abstraction.Command
import devices.CeilingFan
import devices.FanSpeed

class CeilingFanHighCommand(private var ceilingFan: CeilingFan) : Command {

    private lateinit var prevSpeed: FanSpeed

    override fun execute() {
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.high()
    }

    override fun undo() {
        when (prevSpeed) {
            FanSpeed.OFF -> ceilingFan.off()
            FanSpeed.LOW -> ceilingFan.low()
            FanSpeed.MEDIUM -> ceilingFan.medium()
            FanSpeed.HIGH -> ceilingFan.high()
        }
    }
}