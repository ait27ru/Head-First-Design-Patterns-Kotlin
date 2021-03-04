package condiment.abstraction

import beverage.abstraction.Beverage

abstract class CondimentDecorator : Beverage() {
    abstract override var description: String
}