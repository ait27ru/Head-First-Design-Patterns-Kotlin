import pizzaStore.ChicagoPizzaStore
import pizzaStore.NYPizzaStore
import pizzaStore.abstraction.PizzaStore

fun main() {
    val nyStore: PizzaStore = NYPizzaStore()
    nyStore.orderPizza("cheese").also { println() }
    nyStore.orderPizza("veggie").also { println() }

    val chicagoStore: PizzaStore = ChicagoPizzaStore()
    chicagoStore.orderPizza("cheese").also { println() }
    chicagoStore.orderPizza("clam").also { println() }
    chicagoStore.orderPizza("nonexistent").also { println() }
}