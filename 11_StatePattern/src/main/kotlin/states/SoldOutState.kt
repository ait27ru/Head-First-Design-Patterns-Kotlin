package states

import GumballMachine
import states.abstraction.State

class SoldOutState(private var gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("You can't insert a quarter, the machine is sold out")
    }

    override fun ejectQuarter() {
        println("You can't eject, you haven't inserted a quarter yet")
    }

    override fun turnCrank() {
        println("You turned, but there are no gumballs")
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun refill() {
        if(gumballMachine.count > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState())
    }

    override fun toString(): String {
        return "${gumballMachine.name} is sold out"
    }
}