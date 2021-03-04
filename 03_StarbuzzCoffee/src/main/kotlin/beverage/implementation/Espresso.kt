package beverage.implementation

import beverage.abstraction.Beverage

class Espresso : Beverage() {

    init {
        description = "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }
}