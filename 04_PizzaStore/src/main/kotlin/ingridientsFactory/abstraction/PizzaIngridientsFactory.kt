package ingridientsFactory.abstraction

import ingridients.abstraction.*

interface PizzaIngridientsFactory {
    fun createDough() : Dough
    fun createSauce() : Sauce
    fun createCheese() : Cheese
    fun createPepperoni() : Pepperoni
    fun createClams() : Clams
}