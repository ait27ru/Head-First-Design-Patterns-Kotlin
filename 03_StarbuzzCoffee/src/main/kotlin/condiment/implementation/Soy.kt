package condiment.implementation

import beverage.abstraction.Beverage
import condiment.abstraction.CondimentDecorator

class Soy(var beverage: Beverage) : CondimentDecorator() {
    
    override fun cost(): Double {
        return 0.09 + beverage.cost()
    }

    override var description: String
        get() = beverage.description + ", Soy"
        set(description) {}
}