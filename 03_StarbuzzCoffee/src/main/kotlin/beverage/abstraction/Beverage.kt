package beverage.abstraction

abstract class Beverage {

    open var description = "Unknown beverage"

    abstract fun cost(): Double

    override fun toString(): String {
        return "${description}: $${String.format("%.2f", cost())}"
    }
}