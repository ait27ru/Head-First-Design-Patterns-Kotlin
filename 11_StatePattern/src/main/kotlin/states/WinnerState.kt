package states

import GumballMachine
import states.abstraction.State

class WinnerState(private var gumballMachine: GumballMachine) : State {

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
        if(gumballMachine.count == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState())
        }
        else{
            gumballMachine.releaseBall()
            println("YOU'RE A WINNER! You got two gumballs for your quarter")
            if (gumballMachine.count > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState())
            } else {
                println("Oops, out of gumballs!")
                gumballMachine.setState(gumballMachine.getSoldOutState())
            }
        }
    }

    override fun refill() {
    }

    override fun toString(): String {
        return "${gumballMachine.name} has given a prize to the winner"
    }
}