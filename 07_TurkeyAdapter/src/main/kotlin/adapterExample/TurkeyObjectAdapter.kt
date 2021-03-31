package adapterExample

import adapterExample.duck.Duck
import adapterExample.turkey.Turkey

class TurkeyObjectAdapter (private val turkey : Turkey) : Duck {

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for(i in 1..5)
            turkey.fly()
    }
}