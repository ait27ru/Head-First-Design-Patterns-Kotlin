package condiment.implementation

import beverage.abstraction.Beverage
import condiment.abstraction.CondimentDecorator

class Milk(var beverage: Beverage) : CondimentDecorator() {

    override fun cost(): Double {
        return 0.12 + beverage.cost()
    }

    override var description: String
        get() = beverage.description + ", Milk"
        set(description) {}
}