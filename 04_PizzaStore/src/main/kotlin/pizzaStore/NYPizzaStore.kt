package pizzaStore

import pizzaStore.abstraction.PizzaStore
import ingridientsFactory.NYPizzaIngridientsFactory
import pizza.CheesePizza
import pizza.ClamPizza
import pizza.NullPizza
import pizza.PepperoniPizza
import pizza.abstraction.Pizza

class NYPizzaStore : PizzaStore() {

    private val ingredientsFactory = NYPizzaIngridientsFactory()

    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CheesePizza(ingredientsFactory).also { it.setName("NY Style ${it.getName()}") }
            "clam" -> ClamPizza(ingredientsFactory).also { it.setName("NY Style ${it.getName()}") }
            "pepperoni" -> PepperoniPizza(ingredientsFactory).also { it.setName("NY Style ${it.getName()}") }
            else -> NullPizza()
        }
    }
}