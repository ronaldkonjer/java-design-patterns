# Java Design Patterns
---
## Object Oriented Principles

* Encapsulate what varies
* Favor composition over inheritence
* Program to an interface, not implementations
* Strive for loosely coupled designs between objects that interact
* Classes should be open for extension but closed for modification
* Depend on abstractions. Do not depend on concrete classes
* Only talk to your friends
* Don't call us we call you
* A class should have only one reason to change

## Object Oriented Basics

* Abstraction
* Encapsulation
* Polymorphism
* Inheritence

# Creational Patterns
---
There are two ways to parameterize a system by the classes of objects it creates.
1. Subclass the class that creates the objects; this corresponds to using the Factory Method pattern.
Main drawback of this approach is that is can require creating new subclas just to change the class of the product. 
2. Use object composition, by using an object that's responsible for knowing the class of the product objects, and make it a parameter of the system.
This is the key aspect of the Abstract Factory, Builder and Prototype patterns. All three involve creating a new factory object whose responsibility is to create product objects.
These designs are more flexible that the ones that use the Factory Method, but they're also more complex. Often designs start out as a Factory Method and evolve towards other creational patterns.

# Factory
---
## Bullet points
* All factories encapsulate object creation.
* Simple Factory, while not a bonafide design pattern, is a simple way to decouple your clients form concrete classes.
* Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
* All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.
* The intent of Factory Method is to allow a class to defer instantiation to its subclasses.
* The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
* The Dependency Inversion Principle guides us to avoid dependencies on concrete types and to strive for abstraction.
* Factories are a powerfull technique for coding to  abstractions, not concrete cases.

### Abstract Factory - definition (Kit)
> Provides an interface for creating families of related or dependend objects without specifying their concrete classes.

### Factory Method - definition (Virtual constructor)
> Defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.

# Builder
---
## Bullet points
* Encapsulates the way a complex object is constructed.
* Allows objects to be constructed in a multistep and varying process(as pposed to one step factories).
* Hides the internal representation of the product from the client.
* Product inplementations can be swapped in and out because the client only sees an abstract interface.
* Often used for building composite structures
* Constructing objects requires more domain knowledge of the client then when using a Factory

### Builder - definition
> Separates the construction of a complex object from it's representation so that the same construction process can create 
different representations.

# Prototype
---
## Bullet points
* Hides the complexities of making new instances from the client.
* Provides the option for the client to generate objects whose type is not known.
* In some circumstances, copying an object can be more efficient than creating a new object.
* Prototype should be considered when a system must create new objects of many types in a complex class hierarchy.
* A drawback to using the Prototype is that making a copy of an object can sometimes be complicated

### Prototype - definition
> Specify the kinds of objects to create using a prototypical inheritance, and create new objects by copying this prototype.

# Singleton
---
## Bullet Points
* The Singelton Pattern ensures you have at most one instance of a class in your application.
* The Singleton Pattern also provides a global access point to that instance.
* Java's implementation of the Singleton Pattern makes use of a private constructor, a static method combined with a static variable.
* Examine your performance and resource constraints and carefully choose an appropriate Singleton implementation for multithreated applications.(and we should consider all applications multithreaded!!)
* Beare of the double-checked licking implementationl it is not thread-safe in versions before Java 2, version 5.
* Be careful if you are using multiple class loaders; this could defeat the Singleton implementation and result in multiple instances.
* If you are using a JVM earier than 1.2, you'll need to create a registry of Singletons to defeat the farbage collector.

## Dealing with multithreading
1. If performance of getInstance() is not critical to system, do not change the Synchronized getInstance() method. (Be aware that synchronizing a method decreases performance by factor 100)
2. If application always creates and uses an instance of the Singleton, change the lazy loading Singleton into a eagerly Singleton.
3. If performance is critical, use "double-checked locking" to reduse the use of synchronization in the getInstance(), i.o.w. only when Singleton instance not created yet THEN use synchronize. (volatile)

## Consequences
* Violates Single Responsibility Principle (SRP) by controlling their own creation and lifecycle.
* Encourages using a global shared instance which prevents an object and resources used by this object from being deallocated.
* Creates tightly coupled code that is difficult to test.
* Makes it almost impossible to subclass a Singleton.

### Singleton - definition
> Ensures a class has only one instance, and provides a global point of access to it.

### Exercise Java 8 usage documentation
Java 8 - 5 minutes docs: https://blog.idrsolutions.com/2015/03/java-8-consumer-supplier-explained-in-5-minutes/

# Structural Patterns
---
A lot of similarities between the structural patterns, especially in their participants and collaborations. This because they rely on the same small set of language mechanisms for structuring code and objects.
Single and multiple inheritance for class-based patterns, Object composition for object patterns. Although the similairities, there are different intents among these patterns. Learn them to choose the right patterns.

# Adapter
---
## Bullet Points
* When you need to use an existing class and its interface is not the one you need, use an adapter.
* An adapter changes an interface into one a client expects.
* Implementing an adapter ma require little work or a great deal of work depending on the size and complexity of the target interface.
* Two forms of the Adapter Pattern; object and class adapters. Class adapters require multiple inheritance.
* An adapter wraps an object to change its interface.

### Adapter - definition (Wrapper)
> Converts the interface of a class into another interface the client expects. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

# Facade
---
## Bullet Points
* When you need to simplify and unify a large interface or complex set of interfaces, use a facade.
* A facade decouples a client from a complex subsystem.
* Implementing a facade requires that we compose the facade with its subsystem and use delegation to perform the work of the facade.
* You can implement more than one facade for a subsystem.
* A facade "wraps" a set of objects to simplify.

### Facade - definition
> Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.


# The Flyweight
---
## Bullet Points
* Use of the Flyweight pattern depends heavily on how and where it is used. Use the Flyweight pattern only when the following are true:
	* an application uses a large number of objects.
	* storage costs are high because of the sheer quantity of objects.
	* most object state can be made extrinsic.
	* many groups of objects may be replaced b relatively few shared objects once extrinsic state is removed.
	* the application doesn't depend on object identity. Since Flyweight objects may be shared, identity tests will return true for conceptually distinct objects.
* Reduces the number of object instances at runtime, saving memory.
* Centralizes state for many "virtual" objects into a single location.
* The Flyweight is used when a class has many instances, and they can all be controlled indentically.
* A drawback of the Flyweight Pattern is that once you've implemented it, single, logical instances of the class will not be able to behave independently form the other instances.

### Flyweight - definition
> Use the Flyweight Pattern when one instance of a class can be used to provide many "virtual instances". It uses sharing to support large number of fine-grained objects efficiently.

# The Bridge
---
## Bullet points
* Decouples an implementation so that it is not bound permanently to an interface.
* Abstraction and implementation can be extended independently.
* Changes to the concrete abstraction classes don't affect the client.
* Useful ingraphic and windowing systems that need to run over multiple platforms.
* Useful any time you need to vary an interface and an implementation in different ways.
* Increases complexity.

## Use the pattern when:
* you want to avoid a permanent binding between an abstraction and its implementation, This might be the case, e.g. when the implementation must be selected or switched at run-tim.
* both the abstractions and their implementations should be extensible by subclassing. In this case, the Bridge pattern lets you combine the different abstractons and implementations and extend them independently.
* changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be recompiled.
* you have a proliferation of classes. Such a class hierarchy indicates the need for splitting an object into two parts. Rumbaugh uses the term "nested generalizations" to refer to such class hierarchies.
* you want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden  from the client. A simple example is Coplien's String class, in which multiple objects can share the same string representation.

### Bridge - definition (Handle/Body)
> Decouple an abstraction from its implementation so that the two can vary independenty.

# Adapter VS The Bridge 
---

# Iterator
---
## Bullet Points
* An Iterator allows access to an aggregate's elements without exposing its internal structure.
* An Iterator takes the job of iterating over an aggregate and encapsulates it in another object.
* When using an Iterator, we relieve the aggregate of the responsibility of supporting operations for traversing its data.
* An Iterator provides a common interface for traversing the items of an aggregate, allowing you to use polymorphism when writing code that makes use of the items of the aggregate.

### Iterator - definition
> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation

# Composite
---
## Bullet Points
* The Composite Pattern provides a structure to hold both individual objects and composites.
* The composite Pattern allows clients to treat composites and individual objects uniformly.
* A Composite is any object in a Composite structure. Components may be other composites or lead nodes.
* There are many design tradeoffs in implementing Composite. You need to balance transparency and safety with your needs.

### Composite - definition
> Allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

# Decorator
---
## Bullet Points
* Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.
* In our designs we should allow behavior to be extended without the need to modify existing code.
* Composition and delegation can often be used to add new behaviors at runtime.
* The Decorator Pattern provides an alternative to subclassing for extending behavior.
* The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components.
* Decorator classes mirror the type of the components they decorate. (In fact, they are the same type as the components the decorate, either through inheritence or interface implementation.)
* Decorators change the behavior of their components by adding new functionality before and/or after ( or even in place of ) method calls to the component.
* You can wrap a component with any number of decorators.
* Decorators are typically transparent to the client of the component; that is, unless the client is relying on the component's concrete type.
* Decorators can resullt in many small objects in our design, and overuse can be complex.
* A decorator wraps an object to add new behaviors and responsibilities.
* To add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
* For responsibilities that can be withdrawn
* When extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and 
would produce an explosion of subclasses to support every combination. Or a class definition may be hidden or 
otherwise unavailable for subclassing


### Decorator - definition (wrapper)
> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

# Proxy
---
## Bullet Points
*

### Proxy - definition (Surrogate)
> Provide a surrogate or placeholder for another object to control access to it.

# Composite VS Decorator VS Proxy
---








