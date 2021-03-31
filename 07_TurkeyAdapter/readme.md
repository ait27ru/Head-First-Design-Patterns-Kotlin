**Adapter** - Converts the interface of a class into another interface clients expect. Let classes work together that couldn't otherwise because of incompatible interfaces.

**Facade** - Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

Key noes:
- Principle of Least Knowledge (the Law of Demeter) - talk only to your immediate friends, 
  i.e. any method in an object should only invoke methods that belong to: 
    - the object itself
    - objects passed in as a parameter to the method
    - Any object the method creates
    - Any components of the object