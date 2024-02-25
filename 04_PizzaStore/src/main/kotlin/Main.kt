import pizzaStore.ChicagoPizzaStore
import pizzaStore.NYPizzaStore

fun main() {
    val nyStore = NYPizzaStore()
    nyStore.orderPizza("cheese").also { println() }
    nyStore.orderPizza("veggie").also { println() }

    val chicagoStore = ChicagoPizzaStore()
    chicagoStore.orderPizza("cheese").also { println() }
    chicagoStore.orderPizza("clam").also { println() }
    chicagoStore.orderPizza("nonexistent").also { println() }
}