package pizza

import ingridients.abstraction.*
import ingridientsFactory.abstraction.PizzaIngridientsFactory
import pizza.abstraction.Pizza

class PepperoniPizza (private var ingridientsFactory: PizzaIngridientsFactory) : Pizza() {

    override var name = "Pepperoni Pizza"
    override var dough: Dough? = null
    override var sauce: Sauce? = null
    override var cheese: Cheese? = null
    override var pepperoni: Pepperoni? = null
    override var clams: Clams? = null

    override fun prepare() {
        println("Preparing $name")
        dough = ingridientsFactory.createDough()
        sauce = ingridientsFactory.createSauce()
        pepperoni = ingridientsFactory.createPepperoni()
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}