*What is the Abstract Factory Pattern*
**It is like a factory but everything is encapsulated
***The method that orders the object
***The factories that build the object
***The final objects
***The final objects contain objects that use the Strategy Pattern
****Composition: Object class fields are Objects.

*What can you do with an abstract factory
**Allows you to create families of related objects without specifying a concrete class
**Use when you have many objects that can be added, or changed dynamically during runtime
**You can model anything you can imagine and have those objects interact through common interfaces
**The Downfall: Things can get complicated



the factory method pattern is a creational pattern which uses factory methods to deal with the problem of creating objects without specifying the exact class of object that will be created

The motivation behind this pattern is to separate object creation from the client using the object. Client should provide specification to factory but details how the object is built are abstracted away by the factory.

If this is an interface or abstract class is an implementation detail specific to situation, as long as your implementation of the factory lets you achieve the motivation behind pattern.

Consider using abstract classes if any of these statements apply to your situation:

        You want to share code among several closely related classes.

        You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).

        You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.

Consider using interfaces if any of these statements apply to your situation:

        You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.

        You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.

        You want to take advantage of multiple inheritance of type.

In some implementations it might even make more sense to use abstract class rather then interface for the Products created by the factory. 
If there is shared set of features/behavior between all products then it does make sense to put these into base abstract class. 
This could apply even if products are built from different factories.

It boils down to: do you wish to and does it make sense to introduce coupling between products or not? In the end, client will get same result - 
Product built based upon specification, with details of construction abstracted away.