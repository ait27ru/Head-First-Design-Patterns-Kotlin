package duckTest

import java.util.*

fun main() {
    val ducks = arrayOf(
        Duck("Daffy", 8),
        Duck("Dewey", 2),
        Duck("Howard", 7)
    )
    println("Before sorting:")
    display(ducks)
    Arrays.sort(ducks)
    println("\nAfter sorting:")
    display(ducks)
}

fun display(ducks: Array<Duck>) {
    for (d in ducks) {
        println(d)
    }
}