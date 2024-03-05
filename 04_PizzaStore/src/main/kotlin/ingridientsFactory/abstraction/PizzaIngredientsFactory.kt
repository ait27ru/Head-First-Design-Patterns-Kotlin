package ingridientsFactory.abstraction

import ingridients.abstraction.*

interface PizzaIngredientsFactory {
    fun createDough() : Dough
    fun createSauce() : Sauce
    fun createCheese() : Cheese
    fun createPepperoni() : Pepperoni
    fun createClams() : Clams
}