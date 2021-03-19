package pizzaStore

import pizzaStore.abstraction.PizzaStore
import ingridientsFactory.ChicagoPizzaIngridientsFactory
import pizza.CheesePizza
import pizza.ClamPizza
import pizza.NullPizza
import pizza.PepperoniPizza
import pizza.abstraction.Pizza

class ChicagoPizzaStore : PizzaStore() {

    private val ingridientsFactory = ChicagoPizzaIngridientsFactory()

    override fun createPizza(type: String): Pizza {
        return when {
            (type == "cheese") -> CheesePizza(ingridientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            (type == "clam") -> ClamPizza(ingridientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            (type == "pepperoni") -> PepperoniPizza(ingridientsFactory).also { it.setName("Chicago Style ${it.getName()}") }
            else -> NullPizza()
        }
    }
}