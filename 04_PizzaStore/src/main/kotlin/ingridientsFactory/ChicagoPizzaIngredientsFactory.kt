package ingridientsFactory

import ingridients.*
import ingridients.abstraction.*
import ingridientsFactory.abstraction.PizzaIngredientsFactory

class ChicagoPizzaIngredientsFactory : PizzaIngredientsFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClams(): Clams {
        return FrozenClams()
    }
}