class DinerMenu : Menu {
    private val maxItems = 6
    private var numberOfItems = 0
    private var menuItems = arrayOfNulls<MenuItem>(maxItems)

    init{
        addItem("Vegetarian BLT",
            "Fake Bacon with lettuce & tomato on whole wheat",
            true, 2.99)
        addItem("BLT",
            "Bacon with lettuce & tomato on whole wheat",
            false, 2.99)
        addItem("Soup of the day",
            "Soup of the day, with a side of potato salad",
            false, 3.29)
        addItem("Hotdog",
            "A hot dog, with sauerkraut, relish, onions",
            false, 3.05)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        if(numberOfItems >= maxItems)
            println("Sorry, menu is full! Can't add item to menu")
        else{
            menuItems[numberOfItems++] = menuItem
        }
    }

    override fun createIterator(): Iterator<MenuItem> {
        return DinerMenuIterator(menuItems)
    }
}