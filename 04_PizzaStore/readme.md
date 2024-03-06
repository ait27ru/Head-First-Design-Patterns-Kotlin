**Abstract Factory** - Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

**Factory Method** - Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to the subclasses.

Key notes:
- Depend on abstraction. Do not depend on concrete classes.

```mermaid
---
title: Class diagram of Pizza Store implementing the Abstract Factory pattern
---
classDiagram
class PizzaStore{
  <<abstract>>
  +orderPizza(type) Pizza
  #createPizza(type) Pizza*
}
class ChicagoPizzaStore{
  -ChicagoPizzaIngredientsFactory ingredientsFactory
  +createPizza(type) Pizza
}
class NYPizzaStore{
  -NYPizzaIngredientsFactory ingredientsFactory
  +createPizza(type) Pizza
}
ChicagoPizzaStore..|>PizzaStore
NYPizzaStore..|>PizzaStore

class Pizza{
  <<abstract>>
  #String name*
  #Dough dough*
  #Souce souce*
  #Cheese cheese*
  #Pepperoni pepperoni*
  #prepare()*
  +bake()
  +cut()
  +box()
}
class CheesePizza{
  -PizzaIngredientsFactory ingredientsFactory
  +String name
  +Dough dough
  +Souce souce
  +Cheese cheese
  +Pepperoni pepperoni
  +prepare()
  +cut()
}
class PepperoniPizza{
  -PizzaIngredientsFactory ingredientsFactory
  +String name
  +Dough dough
  +Souce souce
  +Cheese cheese
  +Pepperoni pepperoni
  +prepare()
  +cut()
}
Pizza..|>CheesePizza
Pizza..|>PepperoniPizza
