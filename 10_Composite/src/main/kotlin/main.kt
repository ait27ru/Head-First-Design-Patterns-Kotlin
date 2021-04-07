fun main() {
    val pancakeHouseMenu: MenuComponent = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu: MenuComponent = Menu("DINER MENU", "Lunch")
    val cafeMenu: MenuComponent = Menu("CAFE MENU", "Dinner")
    val dessertMenu: MenuComponent = Menu("DESSERT MENU", "Dessert of course!")

    val allMenus: MenuComponent = Menu("ALL MENUS", "All menus combined")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    getDefaultMenuItems(MenuName.Diner).forEach {
        dinerMenu.add(it)
    }

    getDefaultMenuItems(MenuName.Desert).forEach {
        dessertMenu.add(it)
    }

    // add sub-menu
    dinerMenu.add(dessertMenu)

    getDefaultMenuItems(MenuName.Cafe).forEach {
        cafeMenu.add(it)
    }

    getDefaultMenuItems(MenuName.PancakeHouse).forEach {
        pancakeHouseMenu.add(it)
    }

    val waitress = Waitress(allMenus)
    waitress.printMenu()
}

private fun getDefaultMenuItems(menuName: MenuName): Array<MenuItem> {

    when(menuName) {
        MenuName.Diner -> {
            return arrayOf(
                MenuItem("Pasta",
                    "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                    true,
                    3.89),
                MenuItem("Vegetarian BLT",
                    "Fake Bacon with lettuce & tomato on whole wheat",
                    true, 2.99),
                MenuItem("BLT",
                    "Bacon with lettuce & tomato on whole wheat",
                    false, 2.99),
                MenuItem("Soup of the day",
                    "Soup of the day, with a side of potato salad",
                    false, 3.29),
                MenuItem("Hotdog",
                    "A hot dog, with sauerkraut, relish, onions",
                    false, 3.05)
            )
        }
        MenuName.Cafe -> {
            return arrayOf(
                MenuItem("Veggie Burger and Air Fries",
                    "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                    true, 3.99),
                MenuItem("Soup of the day",
                    "A cup of the soup of the day, with a side salad",
                    false, 3.69),
                MenuItem("Burrito",
                    "A large burrito, with whole pinto beans, salsa, guacamole",
                    true, 4.29),
            )
        }
        MenuName.PancakeHouse -> {
            return arrayOf(
                MenuItem("K&B's Pancake Breakfast",
                    "Pancakes with scrambled eggs",
                    true,2.99),
                MenuItem("Regular Pancake Breakfast",
                    "Pancakes with fried eggs, sausage",
                    false,2.99),
                MenuItem("Blueberry Pancakes",
                    "Pancakes made with fresh blueberries",
                    true,3.49),
                MenuItem("Waffles",
                    "Waffles with your choice of blueberries or strawberries",
                    true,3.59))
        }
        MenuName.Desert -> {
            return arrayOf(MenuItem("Apple Pie",
                "Apple pie with a flaky crust, topped with vanilla ice cream",
                true,1.59))
        }
        else -> {
            throw UnsupportedOperationException("Menu type ${menuName.name} not supported yet!")
        }
    }
}