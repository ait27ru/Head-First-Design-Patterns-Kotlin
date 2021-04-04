abstract class CaffeineBeverageWithHook {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) {
            addCondiment()
        }
    }

    protected abstract fun brew()

    protected abstract fun addCondiment()

    protected open fun boilWater() {
        println("Boiling water")
    }

    protected open fun pourInCup() {
        println("Pouring into cup")
    }

    protected open fun customerWantsCondiments(): Boolean {
        return true
    }
}