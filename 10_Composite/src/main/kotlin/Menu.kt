class Menu(
    private val name: String,
    private val description: String): MenuComponent() {

    private var menuComponents = mutableListOf<MenuComponent>()

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun print() {
        println("\n${getName()}, ${getDescription()}")
        println("--------------------------")
        menuComponents.forEach {
            it.print()
        }
    }
}