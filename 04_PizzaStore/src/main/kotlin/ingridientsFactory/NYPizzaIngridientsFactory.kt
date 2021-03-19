package ingridientsFactory

import ingridients.*
import ingridients.abstraction.*
import ingridientsFactory.abstraction.PizzaIngridientsFactory

class NYPizzaIngridientsFactory : PizzaIngridientsFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClams(): Clams {
        return FreshClams()
    }
}