class CoffeeWithHook : CaffeineBeverageWithHook() {

    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiment() {
        println("Adding Sugar and Milk")
    }

    override fun customerWantsCondiments() : Boolean {
        print("Would you like milk and sugar with your coffee? ")
        val answer = readLine()
        return answer?.startsWith("y", ignoreCase = true) ?: false
    }
}