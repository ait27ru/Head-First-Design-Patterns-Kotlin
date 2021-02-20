package implementation

import abstraction.Duck
import behaviour.fly.FlyBehaviour
import behaviour.fly.FlyWithWings
import behaviour.quack.Quack
import behaviour.quack.QuackBehaviour

class MallardDuck : Duck() {

    override var flyBehaviour: FlyBehaviour = FlyWithWings()

    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a real mallard duck!")
    }
}