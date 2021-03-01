package abstraction

import behaviour.fly.FlyBehaviour
import behaviour.quack.QuackBehaviour

abstract class Duck {

    abstract var flyBehaviour: FlyBehaviour
    abstract var quackBehaviour: QuackBehaviour

    abstract fun display()

    open fun performFly() {
        flyBehaviour.fly()
    }

    open fun performQuack() {
        quackBehaviour.quack()
    }

    open fun swim() {
        println("All ducks float, even decoys!")
    }
}