package condiment.implementation

import beverage.abstraction.Beverage
import condiment.abstraction.CondimentDecorator

class Whip(var beverage: Beverage) : CondimentDecorator() {
    
    override fun cost(): Double {
        return 0.14 + beverage.cost()
    }

    override var description: String
        get() = beverage.description + ", Whip"
        set(description) {}
}