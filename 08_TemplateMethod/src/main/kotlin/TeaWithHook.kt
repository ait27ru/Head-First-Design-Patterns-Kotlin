class TeaWithHook : CaffeineBeverageWithHook() {

    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiment() {
        println("Adding Lemon")
    }

    override fun customerWantsCondiments() : Boolean {
        print("Would you like lemon with your tea? ")
        val answer = readLine()
        return answer?.startsWith("y", ignoreCase = true) ?: false
    }
}