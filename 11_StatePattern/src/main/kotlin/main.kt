fun main() {

    var machine = GumballMachine(5)

    for(i in 1..5){
        println("\n" + machine)
        machine.insertQuarter()
        machine.turnCrank()
    }

    println("\n" + machine)
    machine.ejectQuarter()

    println("\n" + machine)
    machine.insertQuarter()
    machine.ejectQuarter()

    println()
    machine.refill(10)
    machine.refill(5)
    println("\n" + machine)
}
