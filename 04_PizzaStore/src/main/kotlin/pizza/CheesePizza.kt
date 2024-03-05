package pizza

import ingridients.abstraction.*
import ingridientsFactory.abstraction.PizzaIngredientsFactory
import pizza.abstraction.Pizza

class CheesePizza(private var ingredientsFactory: PizzaIngredientsFactory) : Pizza() {

    override var name = "Cheese Pizza"
    override var dough: Dough? = null
    override var sauce: Sauce? = null
    override var cheese: Cheese? = null
    override var pepperoni: Pepperoni? = null
    override var clams: Clams? = null

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientsFactory.createDough()
        sauce = ingredientsFactory.createSauce()
        cheese = ingredientsFactory.createCheese()
    }

    override fun cut() {
        println("Cutting the pizza into diagonal slices")
    }
}