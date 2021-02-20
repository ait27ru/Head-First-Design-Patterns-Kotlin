package behaviour.fly

open class FlyNoWay : FlyBehaviour {
    override fun fly() {
        println("I can't fly :-(")
    }
}