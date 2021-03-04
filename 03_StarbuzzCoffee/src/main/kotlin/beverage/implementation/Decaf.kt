package beverage.implementation

import beverage.abstraction.Beverage

class Decaf : Beverage() {

    init {
        description = "Decaf"
    }

    override fun cost(): Double {
        return 1.31
    }
}