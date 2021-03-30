import commands.*
import devices.*

fun main() {

    val numberOfSlots = 5
    val remoteControl = RemoteControlWithUndo(numberOfSlots)

    val stereo = Stereo("Living Room")
    val stereoOnWithCdCommand = StereoOnWithCdCommand(stereo)
    val stereoOffCommand = StereoOffCommand(stereo)

    val ceilingFan = CeilingFan("Bedroom")
    val ceilingFanOnCommand = CeilingFanHighCommand(ceilingFan)
    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)

    val livingRoomLight = Light("Living Room")
    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)

    val kitchenLight = Light("Kitchen")
    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, stereoOnWithCdCommand, stereoOffCommand)
    remoteControl.setCommand(3, ceilingFanOnCommand, ceilingFanOffCommand)

    println(" * Testing single commands *")

    println(remoteControl)

    for(i in 0..numberOfSlots) {
        remoteControl.onButtonWasPushed(i)
        remoteControl.offButtonWasPushed(i)
    }

    remoteControl.undoButtonWasPressed()

    println(" * Testing macro command *")

    val everythingOnCommand = MacroCommand(arrayOf(kitchenLightOn, livingRoomLightOn, stereoOnWithCdCommand))
    val everythingOffCommand = MacroCommand(arrayOf(kitchenLightOff, livingRoomLightOff, stereoOffCommand))
    remoteControl.setCommand(4, everythingOnCommand, everythingOffCommand)

    println(remoteControl)

    remoteControl.onButtonWasPushed(4)
    remoteControl.offButtonWasPushed(4)
    remoteControl.undoButtonWasPressed()
}