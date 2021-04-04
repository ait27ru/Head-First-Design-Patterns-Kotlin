fun main() {
    val teaWithHook = TeaWithHook()
    val coffeeWithHook = CoffeeWithHook()

    println("### Making tea...")
    teaWithHook.prepareRecipe()

    println("\n### Making coffee...")
    coffeeWithHook.prepareRecipe()
}