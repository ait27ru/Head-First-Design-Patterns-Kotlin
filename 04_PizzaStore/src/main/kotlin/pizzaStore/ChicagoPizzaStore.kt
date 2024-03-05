package pizzaStore

import pizzaStore.abstraction.PizzaStore
import ingridientsFactory.ChicagoPizzaIngredientsFactory
import pizza.CheesePizza
import pizza.ClamPizza
import pizza.NullPizza
import pizza.PepperoniPizza
import pizza.abstraction.Pizza

class ChicagoPizzaStore : PizzaStore() {

    private val ingredientsFactory = ChicagoPizzaIngredientsFactory()

    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CheesePizza(ingredientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            "clam" -> ClamPizza(ingredientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            "pepperoni" -> PepperoniPizza(ingredientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            else -> NullPizza()
        }
    }
}