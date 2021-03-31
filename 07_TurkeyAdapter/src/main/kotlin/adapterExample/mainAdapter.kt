package adapterExample

import adapterExample.duck.Duck
import adapterExample.duck.MallardDuck
import adapterExample.turkey.WildTurkey

fun main() {
    val duck = MallardDuck()
    val turkey = WildTurkey()
    val turkeyObjectAdapter: Duck = TurkeyObjectAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\nThe Duck says...")
    testDuck(duck)

    println("\nThe TurkeyObjectAdapter says...")
    testDuck(turkeyObjectAdapter)
}

fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}