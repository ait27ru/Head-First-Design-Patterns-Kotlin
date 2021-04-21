package states

import GumballMachine
import states.abstraction.State

class NoQuarterState(private var gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("You inserted a quarter")
        gumballMachine.setState(gumballMachine.getHasQuarterState())
    }

    override fun ejectQuarter() {
        println("You haven't inserted a quarter")
    }

    override fun turnCrank() {
        println("You turned but there's no quarter")
    }

    override fun dispense() {
        println("You need to pay first")
    }

    override fun refill() {
    }

    override fun toString(): String {
        return "${gumballMachine.name} is waiting for quarter"
    }
}