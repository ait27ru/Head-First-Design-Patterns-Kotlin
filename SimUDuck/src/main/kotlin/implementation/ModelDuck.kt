package implementation

import abstraction.Duck
import behaviour.fly.FlyBehaviour
import behaviour.fly.FlyNoWay
import behaviour.quack.Quack
import behaviour.quack.QuackBehaviour

class ModelDuck : Duck() {

    override var flyBehaviour: FlyBehaviour = FlyNoWay()

    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a model duck")
    }
}