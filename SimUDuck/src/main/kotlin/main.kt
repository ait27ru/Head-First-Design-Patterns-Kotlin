import implementation.DecoyDuck
import implementation.MallardDuck
import implementation.ModelDuck

fun main() {

    val mallardDuck = MallardDuck()
    mallardDuck.display()
    mallardDuck.performFly()
    mallardDuck.performQuack()
    mallardDuck.swim()

    println()

    val modelDuck = ModelDuck()
    modelDuck.display()
    modelDuck.performFly()
    modelDuck.performQuack()
    modelDuck.swim()

    println()

    val decoyDuck = DecoyDuck()
    decoyDuck.display()
    decoyDuck.performFly()
    decoyDuck.performQuack()
    decoyDuck.swim()

    println("\nPress enter to exit...")
    readLine()
}