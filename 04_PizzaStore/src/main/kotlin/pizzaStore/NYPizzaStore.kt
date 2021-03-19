package pizzaStore

import pizzaStore.abstraction.PizzaStore
import ingridientsFactory.NYPizzaIngridientsFactory
import pizza.CheesePizza
import pizza.ClamPizza
import pizza.NullPizza
import pizza.PepperoniPizza
import pizza.abstraction.Pizza

class NYPizzaStore : PizzaStore() {

    private val ingridientsFactory = NYPizzaIngridientsFactory()

    override fun createPizza(type: String): Pizza {
        return when {
            (type == "cheese") -> CheesePizza(ingridientsFactory).also { it.setName("NY Style ${it.getName()}") }
            (type == "clam") -> ClamPizza(ingridientsFactory).also { it.setName("NY Style ${it.getName()}") }
            (type == "pepperoni") -> PepperoniPizza(ingridientsFactory).also { it.setName("NY Style ${it.getName()}") }
            else -> NullPizza()
        }
    }
}