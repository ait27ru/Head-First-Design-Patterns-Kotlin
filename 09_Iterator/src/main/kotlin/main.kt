fun main() {
    val menuList = mutableListOf(PancakeHouseMenu(), DinerMenu(), CafeMenu())
    val waitress = Waitress(menuList)
    waitress.printMenu()
}

