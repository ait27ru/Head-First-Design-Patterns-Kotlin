package behaviour.quack

open class MuteQuack : QuackBehaviour {
    override fun quack() {
        println("<< Silence >>")
    }
}