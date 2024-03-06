# Definitions

**Abstract Factory** - Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

**Factory Method** - Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to the subclasses.

Key notes:
- Depend on abstraction. Do not depend on concrete classes.

# Class diagrams

```mermaid
---
title: Class diagram of Pizza Store implementing the Abstract Factory pattern
---
classDiagram
Client-->PizzaStore
Client-->Pizza
class PizzaStore {
  <<abstract>>
  +orderPizza(type) Pizza
  #createPizza(type) Pizza*
}
class ChicagoPizzaStore {
  -ChicagoPizzaIngredientsFactory ingredientsFactory
  +createPizza(type) Pizza
}
ChicagoPizzaStore..|>PizzaStore
ChicagoPizzaStore-->ChicagoPizzaIngredientsFactory
note for ChicagoPizzaStore "It's easy to extend PizzaStore and create another regional implementation!"

class Pizza {
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
class CheesePizza {
  -PizzaIngredientsFactory ingredientsFactory
  +String name
  +Dough dough
  +Souce souce
  +Cheese cheese
  +Pepperoni pepperoni
  +prepare()
  +cut()
}
class PepperoniPizza {
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

class PizzaIngredientsFactory {
  <<interface>>
  createDough() Dough
  createSauce() Sauce
  createCheese() Cheese
  createPepperoni() Pepperoni
}
class ChicagoPizzaIngredientsFactory {
  +createDough() Dough
  +createSauce() Sauce
  +createCheese() Cheese
  +createPepperoni() Pepperoni
}
ChicagoPizzaIngredientsFactory..|>PizzaIngredientsFactory
ChicagoPizzaIngredientsFactory-->ThickCrustDough
ChicagoPizzaIngredientsFactory-->PlumTomatoSauce
ChicagoPizzaIngredientsFactory-->MozzarellaCheese
ChicagoPizzaIngredientsFactory-->SlicedPepperoni
note for ChicagoPizzaIngredientsFactory "It's easy to extend PizzaIngredientsFactory to create another regional implementation!"

class Dough {
  <<abstract>>
}
ThinCrustDough..|>Dough
ThickCrustDough..|>Dough

class Sauce {
  <<abstract>>
}
PlumTomatoSauce..|>Sauce
MarinaraSauce..|>Sauce

class Cheese {
  <<abstract>>
}
MozzarellaCheese..|>Cheese
ReggianoCheese..|>Cheese

class Pepperoni {
  <<abstract>>
}
SlicedPepperoni..|>Pepperoni
