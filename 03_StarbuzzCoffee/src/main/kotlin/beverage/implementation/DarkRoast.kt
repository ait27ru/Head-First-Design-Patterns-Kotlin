package beverage.implementation

import beverage.abstraction.Beverage

class DarkRoast : Beverage() {

    init {
        description = "Dark Roast"
    }

    override fun cost(): Double {
        return 1.65
    }
}