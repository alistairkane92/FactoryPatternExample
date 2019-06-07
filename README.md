# Factory Pattern Example

This is an example of the Factory design pattern. The Factory pattern allows us to abstract the logic of creating objects to a Factory class.

In this example we have:
* Weapon abstract superclass
* IAttack interface which enforces an attack method
* Axe/Sword/Dagger classes contained in a library which each inherit from Weapon and implement IAttack
* WeaponType ENUM
* WeaponFactory class which has a create method

The WeaponFactory decides which types of object to create and how to create it, based on the argument passed to the create method. If someone wants an Axe, the factory's create method will return an Axe object.

The type of object that the Weapon Factory's create method will return is an IAttack object. Because our concrete Axe/Sword/Dagger classes all implement this interface (and thanks to the wonders of Polymorphism) objects of these classes can be polymorphed into valid IAttack objects and returned from the create function.

This is a good use of an ENUM too. Rather than allowing "magic strings" to be passed in, we are only able to select from a fixed set of values, where each value has a corresponding class.

Our Weapon classes are open and decoupled. We have avoided setting default values in the constructor, but can pass defaultDamage values for our objects via the Factory's create method. This means that if we wanted to create a different game where the damage values were different, we could use the same classes and pass in different values.

Even better than that, if we ever needed to change the default damage values of every weapon object, we would only ever need to change it in one place, in the create method.

These are just some of the many advantages that this kind of pattern provides our application.
