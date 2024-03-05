import pizzaStore.ChicagoPizzaStore
import pizzaStore.NYPizzaStore
import pizzaStore.abstraction.PizzaStore

fun main() {
    // The client doesn't care which specific factory it is.
    // It only cares that it implements PizzaStore interface (or abstract class).
    // Hence, the type of nyStore is an abstract PizzaStore, not concrete NYPizzaStore
    val nyStore: PizzaStore = NYPizzaStore()
    nyStore.orderPizza("cheese").also { println() }
    nyStore.orderPizza("veggie").also { println() }

    val chicagoStore: PizzaStore = ChicagoPizzaStore()
    chicagoStore.orderPizza("cheese").also { println() }
    chicagoStore.orderPizza("clam").also { println() }
    chicagoStore.orderPizza("nonexistent").also { println() }
}