package condiment.implementation

import beverage.abstraction.Beverage
import condiment.abstraction.CondimentDecorator

class Mocha(var beverage: Beverage) : CondimentDecorator() {

    override fun cost(): Double {
        return 0.20 + beverage.cost()
    }

    override var description: String
        get() = beverage.description + ", Mocha"
        set(description) {}
}