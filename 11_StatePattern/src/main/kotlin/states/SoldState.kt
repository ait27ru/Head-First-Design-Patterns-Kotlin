package states

import GumballMachine
import states.abstraction.State

class SoldState(private var gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("Please wait, we're already giving you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank() {
        println("Turning twice doesn't ge you another gumball!")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState())
        } else {
            println("Oops, out of gumballs!")
            gumballMachine.setState(gumballMachine.getSoldOutState())
        }
    }

    override fun refill() {
    }

    override fun toString(): String {
        return "${gumballMachine.name} has sold a gumball"
    }
}