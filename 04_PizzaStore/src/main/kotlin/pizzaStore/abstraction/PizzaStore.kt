package pizzaStore.abstraction

import pizza.abstraction.Pizza

abstract class PizzaStore {

    fun orderPizza(type: String): Pizza {

        val pizza = createPizza(type)

        if(pizza.getName() === "") {
            println("Pizza of type [$type] is not supported")
        } else {
            pizza.prepare()
            pizza.bake()
            pizza.cut()
            pizza.box()
        }

        return pizza
    }

    protected abstract fun createPizza(type: String): Pizza
}