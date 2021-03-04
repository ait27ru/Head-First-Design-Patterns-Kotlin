package beverage.implementation

import beverage.abstraction.Beverage

class HouseBlend : Beverage() {

    init {
        description = "House Blend Coffee"
    }

    override fun cost(): Double {
        return .89
    }
}