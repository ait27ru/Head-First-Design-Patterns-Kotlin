import beverage.implementation.*
import condiment.implementation.*

fun main(args: Array<String>) {

    var espresso = Espresso().also { println(it.toString()) }
    Whip(Mocha(Mocha(espresso))).also { println(it.toString()) }

    var darkRoast = DarkRoast().also { println(it.toString()) }
    Milk(Whip(Soy(darkRoast))).also { println(it.toString()) }
    Mocha(Mocha(Whip(darkRoast))).also { println(it.toString()) }

    var houseBlend = HouseBlend().also { println(it.toString()) }
    Soy(Mocha(Whip(houseBlend))).also { println(it.toString()) }
}
