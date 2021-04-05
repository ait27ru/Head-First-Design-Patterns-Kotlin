import java.util.ArrayList

class PancakeHouseMenu : Menu {

    private var menuItems = ArrayList<MenuItem>()

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems.add(menuItem)
    }

    init {
        addItem(
            "K&B's Pancake Breakfast",
            "Pancakes with scrambled eggs",
            true,
            2.99
        )
        addItem(
            "Regular Pancake Breakfast",
            "Pancakes with fried eggs, sausage",
            false,
            2.99
        )
        addItem(
            "Blueberry Pancakes",
            "Pancakes made with fresh blueberries",
            true,
            3.49
        )
        addItem(
            "Waffles",
            "Waffles with your choice of blueberries or strawberries",
            true,
            3.59
        )
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.iterator()
    }
}