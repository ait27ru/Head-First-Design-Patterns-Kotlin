package states

import GumballMachine
import states.abstraction.State

class HasQuarterState(private var gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.setState(gumballMachine.getNoQuarterState())
    }

    override fun turnCrank() {
        println("You turned...")
        val winner = (0..10).random()
        if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState())
        } else {
            gumballMachine.setState(gumballMachine.getSoldState())
        }
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun refill() {
    }

    override fun toString(): String {
        return "${gumballMachine.name} has a quarter"
    }
}