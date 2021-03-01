package implementation

import abstraction.Duck
import behaviour.fly.FlyBehaviour
import behaviour.fly.FlyNoWay
import behaviour.quack.QuackBehaviour
import behaviour.quack.Squeak

class DecoyDuck : Duck() {

    override var flyBehaviour: FlyBehaviour = FlyNoWay()

    override var quackBehaviour: QuackBehaviour = Squeak()

    override fun display() {
        println("I'm a decoy duck!")
    }
}