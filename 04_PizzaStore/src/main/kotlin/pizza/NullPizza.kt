package pizza

import ingridients.abstraction.*
import pizza.abstraction.Pizza

class NullPizza() : Pizza() {
    override var name = ""
    override var dough: Dough? = null
    override var sauce: Sauce? = null
    override var cheese: Cheese? = null
    override var pepperoni: Pepperoni? = null
    override var clams: Clams? = null
    override fun prepare() { }
}
