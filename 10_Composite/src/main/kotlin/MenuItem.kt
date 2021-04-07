class MenuItem(
    private val name: String,
    private val description: String,
    private val vegetarian: Boolean,
    private val price: Double) : MenuComponent() {

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun getPrice(): Double {
        return price
    }

    override fun isVegetarian() : Boolean {
        return vegetarian
    }

    override fun print() {
        println("${getName()} ${if(isVegetarian()) "(V)" else ""}, ${getPrice()}   --  ${getDescription()}")
    }
}
