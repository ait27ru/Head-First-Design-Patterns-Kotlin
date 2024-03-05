package pizzaStore

import pizzaStore.abstraction.PizzaStore
import ingridientsFactory.ChicagoPizzaIngridientsFactory
import pizza.CheesePizza
import pizza.ClamPizza
import pizza.NullPizza
import pizza.PepperoniPizza
import pizza.abstraction.Pizza

class ChicagoPizzaStore : PizzaStore() {

    private val ingredientsFactory = ChicagoPizzaIngridientsFactory()

    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CheesePizza(ingredientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            "clam" -> ClamPizza(ingredientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            "pepperoni" -> PepperoniPizza(ingredientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            else -> NullPizza()
        }
    }
}