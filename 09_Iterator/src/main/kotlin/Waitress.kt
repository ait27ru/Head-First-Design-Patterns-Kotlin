class Waitress(private var menus: MutableList<Menu>) {

    fun printMenu() {
        menus.forEach {
            println()
            printMenu(it.createIterator())
        }
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            println("${menuItem.name}, ${menuItem.price} -- ${if(menuItem.vegetarian) "(V)" else ""} ${menuItem.description}")
        }
    }
}