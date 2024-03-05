package pizza

import ingridients.abstraction.*
import ingridientsFactory.abstraction.PizzaIngridientsFactory
import pizza.abstraction.Pizza

class ClamPizza(private var ingredientsFactory: PizzaIngridientsFactory) : Pizza() {

    override var name = "Clam Pizza"
    override var dough: Dough? = null
    override var sauce: Sauce? = null
    override var cheese: Cheese? = null
    override var pepperoni: Pepperoni? = null
    override var clams: Clams? = null

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientsFactory.createDough()
        sauce = ingredientsFactory.createSauce()
        clams = ingredientsFactory.createClams()
    }
}