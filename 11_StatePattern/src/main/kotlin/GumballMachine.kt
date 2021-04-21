import states.*
import states.abstraction.State

class GumballMachine(numberGumballs: Int) {

    private val soldOutState: State = SoldOutState(this)
    private val noQuarterState: State = NoQuarterState(this)
    private val hasQuarterState: State = HasQuarterState(this)
    private val soldState: State = SoldState(this)
    private val winnerState: State = WinnerState(this)

    val name = "Machine"

    var count: Int = numberGumballs
    private var state: State = if (numberGumballs > 0) noQuarterState else soldOutState

    fun insertQuarter(){
        state.insertQuarter()
    }

    fun ejectQuarter(){
        state.ejectQuarter()
    }

    fun turnCrank(){
        state.turnCrank()
        state.dispense()
    }

    fun refill(numberOfGumballs: Int) {
        count += numberOfGumballs
        println("The gumball machine was just refilled; its new count is $count")
        state.refill()
    }

    @JvmName("setState1")
    internal fun setState(state: State){
        this.state = state
    }

    internal fun getSoldOutState(): State {
        return soldOutState
    }

    internal fun getNoQuarterState(): State {
        return noQuarterState
    }

    internal fun getHasQuarterState(): State {
        return hasQuarterState
    }

    internal fun getSoldState(): State {
        return soldState
    }

    internal fun getWinnerState(): State {
        return winnerState
    }

    internal fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if(count > 0){
            count--
        }
    }

    override fun toString(): String {

        return buildString {
            appendLine("Mighty Gumball, Inc.")
            appendLine("Kotlin-enabled Standing Gumball Model #2021")
            appendLine("Inventory: $count gumballs")
            appendLine(state.toString())
        }
    }
}