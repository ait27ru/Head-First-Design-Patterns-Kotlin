package pizza.abstraction

import ingridients.abstraction.*

abstract class Pizza {

    protected abstract var name: String
    protected abstract var dough: Dough?
    protected abstract var sauce: Sauce?
    protected abstract var cheese: Cheese?
    protected abstract var pepperoni: Pepperoni?
    protected abstract var clams: Clams?

    abstract fun prepare()

    open fun bake() {
        println("Bake for 25 minutes at 200 C")
    }

    open fun cut() {
        println("Cutting the pizza into slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    @JvmName("getName1")
    fun getName(): String {
        return name
    }

    @JvmName("setName1")
    fun setName(name: String){
        this.name = name
    }
}