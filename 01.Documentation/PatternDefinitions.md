# Java Design Patterns
---
## Introduction

Design patterns are solutions to recurring problems; **guidelines on how to tackle certain problems**. They are not classes, packages or libraries that you can plug into your application and wait for the magic to happen. These are, rather, guidelines on how to tackle certain problems in certain situations. 

> Design patterns are solutions to recurring problems; guidelines on how to tackle certain problems

Wikipedia describes them as

> In software engineering, a software design pattern is a general reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations.

Be Careful
-----------------
- Design patterns are not a silver bullet to all your problems.
- Do not try to force them; bad things are supposed to happen, if done so. Keep in mind that design patterns are solutions **to** problems, not solutions **finding** problems; so don't overthink.
- If used in a correct place in a correct manner, they can prove to be a savior; or else they can result in a horrible mess of a code.

> Also note that the code samples below are in PHP-7, however this shouldn't stop you because the concepts are same anyways. Plus the **support for other languages is underway**.

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

# Types of Design Patterns
---
* [Creational](#creational-patterns)
* [Structural](#structural-patterns)
* [Behavioral](#behavioral-patterns)

# Creational Patterns
---
### In plain words
> Creational patterns are focused towards how to instantiate an object or group of related objects.

### Wikipedia says
> In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.
 
There are two ways to parameterize a system by the classes of objects it creates.
1. Subclass the class that creates the objects; this corresponds to using the Factory Method pattern.
Main drawback of this approach is that is can require creating new subclas just to change the class of the product. 
2. Use object composition, by using an object that's responsible for knowing the class of the product objects, and make it a parameter of the system.
This is the key aspect of the Abstract Factory, Builder and Prototype patterns. All three involve creating a new factory object whose responsibility is to create product objects.
These designs are more flexible that the ones that use the Factory Method, but they're also more complex. Often designs start out as a Factory Method and evolve towards other creational patterns.

## Creational Pattern Types
 * [Simple Factory](#simple-factory)
 * [Factory Method](#factory-method)
 * [Abstract Factory](#abstract-factory)
 * [Builder](#builder)
 * [Prototype](#prototype)
 * [Singleton](#singleton)

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

## Simple Factory
---
### Real world example
> Consider, you are building a house and you need doors. It would be a mess if every time you need a door, you put on your carpenter clothes and start making a door in your house. Instead you get it made from a factory.

### In plain words
> Simple factory simply generates an instance for client without exposing any instantiation logic to the client

### Wikipedia says
> In object-oriented programming (OOP), a factory is an object for creating other objects formally a factory is a function or method that returns objects of a varying prototype or class from some method call, which is assumed to be "new".

### When to use?
When creating an object is not just a few assignments and involves some logic, it makes sense to put it in a dedicated factory instead of repeating the same code everywhere. 

## Factory Method
---
### Real world example
> Consider the case of a hiring manager. It is impossible for one person to interview for each of the positions. Based on the job opening, she has to decide and delegate the interview steps to different people. 

### In plain words
> It provides a way to delegate the instantiation logic to child classes. 

### Wikipedia says
> In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

### Factory Method - definition (Virtual constructor)
> Defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.

### When to use?
Useful when there is some generic processing in a class but the required sub-class is dynamically decided at runtime. Or putting it in other words, when the client doesn't know what exact sub-class it might need.

## Abstract Factory
---
### Real world example
> Extending our door example from Simple Factory. Based on your needs you might get a wooden door from a wooden door shop, iron door from an iron shop or a PVC door from the relevant shop. Plus you might need a guy with different kind of specialities to fit the door, for example a carpenter for wooden door, welder for iron door etc. As you can see there is a dependency between the doors now, wooden door needs carpenter, iron door needs a welder etc.

### In plain words
> A factory of factories; a factory that groups the individual but related/dependent factories together without specifying their concrete classes. 
  
### Wikipedia says
> The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes

### Abstract Factory - definition (Kit)
> Provides an interface for creating families of related or dependend objects without specifying their concrete classes.

### When to use?
When there are interrelated dependencies with not-that-simple creation logic involved

# Builder
---
## Bullet points
* Encapsulates the way a complex object is constructed.
* Allows objects to be constructed in a multistep and varying process(as pposed to one step factories).
* Hides the internal representation of the product from the client.
* Product inplementations can be swapped in and out because the client only sees an abstract interface.
* Often used for building composite structures
* Constructing objects requires more domain knowledge of the client then when using a Factory

### Real world example
> Imagine you are at Hardee's and you order a specific deal, lets say, "Big Hardee" and they hand it over to you without *any questions*; this is the example of simple factory. But there are cases when the creation logic might involve more steps. For example you want a customized Subway deal, you have several options in how your burger is made e.g what bread do you want? what types of sauces would you like? What cheese would you want? etc. In such cases builder pattern comes to the rescue.

### In plain words
> Allows you to create different flavors of an object while avoiding constructor pollution. Useful when there could be several flavors of an object. Or when there are a lot of steps involved in creation of an object.
 
### Wikipedia says
> The builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping constructor anti-pattern.

### Builder - definition
> Separates the construction of a complex object from it's representation so that the same construction process can create 
different representations.

### When to use?
When there could be several flavors of an object and to avoid the constructor telescoping. The key difference from the factory pattern is that; factory pattern is to be used when the creation is a one step process while builder pattern is to be used when the creation is a multi step process.

# Prototype
---
## Bullet points
* Hides the complexities of making new instances from the client.
* Provides the option for the client to generate objects whose type is not known.
* In some circumstances, copying an object can be more efficient than creating a new object.
* Prototype should be considered when a system must create new objects of many types in a complex class hierarchy.
* A drawback to using the Prototype is that making a copy of an object can sometimes be complicated

### Real world example
> Remember dolly? The sheep that was cloned! Lets not get into the details but the key point here is that it is all about cloning

### In plain words
> Create object based on an existing object through cloning.

### Wikipedia says
> The prototype pattern is a creational design pattern in software development. It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects.

In short, it allows you to create a copy of an existing object and modify it to your needs, instead of going through the trouble of creating an object from scratch and setting it up.

### Prototype - definition
> Specify the kinds of objects to create using a prototypical inheritance, and create new objects by copying this prototype.

### When to use?
When an object is required that is similar to existing object or when the creation would be expensive as compared to cloning.

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

### Real world example
> There can only be one president of a country at a time. The same president has to be brought to action, whenever duty calls. President here is singleton.

### In plain words
> Ensures that only one object of a particular class is ever created.

### Wikipedia says
> In software engineering, the singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system.

Singleton pattern is actually considered an anti-pattern and overuse of it should be avoided. It is not necessarily bad and could have some valid use-cases but should be used with caution because it introduces a global state in your application and change to it in one place could affect in the other areas and it could become pretty difficult to debug. The other bad thing about them is it makes your code tightly coupled plus it mocking the singleton could be difficult.

### Singleton - definition
> Ensures a class has only one instance, and provides a global point of access to it.

### Exercise Java 8 usage documentation
Java 8 - 5 minutes docs: https://blog.idrsolutions.com/2015/03/java-8-consumer-supplier-explained-in-5-minutes/

# Structural Patterns
---
### In plain words
> Structural patterns are mostly concerned with object composition or in other words how the entities can use each other. Or yet another explanation would be, they help in answering "How to build a software component?"

### Wikipedia says
> In software engineering, structural design patterns are design patterns that ease the design by identifying a simple way to realize relationships between entities.

## Structural Pattern Types
 * [Adapter](#adapter)
 * [Facade](#facade)
 * [Flyweight](#flyweight)
 * [Bridge](#bridge)
 * [Iterator](#iterator)
 * [Composite](#composite)
 * [Decorator](#decorator)
 * [Proxy](#proxy)

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

### Real world example
> Consider that you have some pictures in your memory card and you need to transfer them to your computer. In order to transfer them you need some kind of adapter that is compatible with your computer ports so that you can attach memory card to your computer. In this case card reader is an adapter.
> Another example would be the famous power adapter; a three legged plug can't be connected to a two pronged outlet, it needs to use a power adapter that makes it compatible with the two pronged outlet.
> Yet another example would be a translator translating words spoken by one person to another

### In plain words
> Adapter pattern lets you wrap an otherwise incompatible object in an adapter to make it compatible with another class.

### Wikipedia says
> In software engineering, the adapter pattern is a software design pattern that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

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

### Real world example
> How do you turn on the computer? "Hit the power button" you say! That is what you believe because you are using a simple interface that computer provides on the outside, internally it has to do a lot of stuff to make it happen. This simple interface to the complex subsystem is a facade.

### In plain words
> Facade pattern provides a simplified interface to a complex subsystem.

### Wikipedia says
> A facade is an object that provides a simplified interface to a larger body of code, such as a class library.

### Facade - definition
> Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

# Flyweight
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

### Real world example
> Did you ever have fresh tea from some stall? They often make more than one cup that you demanded and save the rest for any other customer so to save the resources e.g. gas etc. Flyweight pattern is all about that i.e. sharing.

### In plain words
> It is used to minimize memory usage or computational expenses by sharing as much as possible with similar objects.

### Wikipedia says
> In computer programming, flyweight is a software design pattern. A flyweight is an object that minimizes memory use by sharing as much data as possible with other similar objects; it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory.

### Flyweight - definition
> Use the Flyweight Pattern when one instance of a class can be used to provide many "virtual instances". It uses sharing to support large number of fine-grained objects efficiently.

# Bridge
---
## Bullet points
* Decouples an implementation so that it is not bound permanently to an interface.
* Abstraction and implementation can be extended independently.
* Changes to the concrete abstraction classes don't affect the client.
* Useful ingraphic and windowing systems that need to run over multiple platforms.
* Useful any time you need to vary an interface and an implementation in different ways.
* Increases complexity.

### Use the pattern when:
* you want to avoid a permanent binding between an abstraction and its implementation, This might be the case, e.g. when the implementation must be selected or switched at run-tim.
* both the abstractions and their implementations should be extensible by subclassing. In this case, the Bridge pattern lets you combine the different abstractons and implementations and extend them independently.
* changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be recompiled.
* you have a proliferation of classes. Such a class hierarchy indicates the need for splitting an object into two parts. Rumbaugh uses the term "nested generalizations" to refer to such class hierarchies.
* you want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden  from the client. A simple example is Coplien's String class, in which multiple objects can share the same string representation.

### Real world example
> Consider you have a website with different pages and you are supposed to allow the user to change the theme. What would you do? Create multiple copies of each of the pages for each of the themes or would you just create separate theme and load them based on the user's preferences? Bridge pattern allows you to do the second i.e.

![With and without the bridge pattern](https://cloud.githubusercontent.com/assets/11269635/23065293/33b7aea0-f515-11e6-983f-98823c9845ee.png)

### In Plain Words
> Bridge pattern is about preferring composition over inheritance. Implementation details are pushed from a hierarchy to another object with a separate hierarchy.

### Wikipedia says
> The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary independently"

### Bridge - definition (Handle/Body)
> Decouple an abstraction from its implementation so that the two can vary independenty.

# Composite
---
## Bullet Points
* The Composite Pattern provides a structure to hold both individual objects and composites.
* The composite Pattern allows clients to treat composites and individual objects uniformly.
* A Composite is any object in a Composite structure. Components may be other composites or lead nodes.
* There are many design tradeoffs in implementing Composite. You need to balance transparency and safety with your needs.

### Real world example
> Every organization is composed of employees. Each of the employees has same features i.e. has a salary, has some responsibilities, may or may not report to someone, may or may not have some subordinates etc.

### In plain words
> Composite pattern lets clients to treat the individual objects in a uniform manner.

### Wikipedia says
> In software engineering, the composite pattern is a partitioning design pattern. The composite pattern describes that a group of objects is to be treated in the same way as a single instance of an object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

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

### Real world example
> Imagine you run a car service shop offering multiple services. Now how do you calculate the bill to be charged? You pick one service and dynamically keep adding to it the prices for the provided services till you get the final cost. Here each type of service is a decorator.

### In plain words
> Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator class.

### Wikipedia says
> In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.

### Decorator - definition (wrapper)
> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

# Proxy
---
## Bullet Points
* The Proxy Pattern provides a representative for other objects in order to control the client's access to it. There are a number of ways it can manage access.
* A Remote Proxy manages interaction between a client and a remote object.
* A Virtual Proxy controls access to an object that is expensive to instantiate.
* A Protection Proxy controls access to the methods of an object based on the caller.
* Many other variants of the Proxy Pattern exist including caching proxies, synchronization proxies, firewall proxies, copy-on-write proxies, and so on.
* Proxy is structurally similar to Decorator, but they differ in their purpose.
* The Decorator Pattern adds behavior to an object, while a Proxy controls access.
* Java's built-in support for Proxy can build a dynamic proxy class on demand and dispatch all calls on it to a handler of your choosing.
* Like any wrapper, proxies will increase the number of classes and objects in your design.

### Real world example
> Have you ever used an access card to go through a door? There are multiple options to open that door i.e. it can be opened either using access card or by pressing a button that bypasses the security. The door's main functionality is to open but there is a proxy added on top of it to add some functionality.

### In plain words
> Using the proxy pattern, a class represents the functionality of another class.

### Wikipedia says
> A proxy, in its most general form, is a class functioning as an interface to something else. A proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked.

### Proxy - definition (Surrogate)
> Provide a surrogate or placeholder for another object to control access to it.

# Discussion of Structural Patterns
---
There are similairities between the structural patterns, especially in their participants and collaborations. This is because the structural patterns rely on the same small set of language mechanics for structuring code and objects.
single and multiple inheritance for class-based patterns, and object composition for object patterns. But although the similairities, there are different intents for which the patterns are used.
The differences between the somewhat similar patterns with other intents are significant because they capture solutions to specific recurring problems in object-oriented design. Although patterns can be combined ofcourse.
E.g. Think about a Proxy-Decorator that adds functionality to a proxy, or a Decorator-Proxy that embellishes a remote object.

# Adapter VS The Bridge 
---
* Both promote flexibility by providing a level of indirection to another object. 
* Both involve forwarding requests to this object from an interface other than its own.
* Adapter focuses on resolving incompatibilities between two existing interfaces, it doesn't focus on how those interfaces are implemented, nor does it consider how they might evolve independently.
* Adapter provides a way of making two independently designed classes work together without reimplementing one or the other.
* Adapter becomes necessary when you discover that two incompatible classes should work together, generally to avoid replication of code. The coupling is unforeseen in earlier stages of the lifecycle.
* Adapter makes things work after they are designed.
* A Facade is not an Adapter because; although it is an interface to a set of other objects; it defines a 'new' interface, whereas the adapter reuses an old interface. Remember that an Adapter makes two existing interfaces work togetheras opposed to defininf an entirely new one.
* Bridge bridges an abstraction and its (potentially numerous) implementations. It provides a stable interface to clients even as it lets you vary the classes that impement it.
* Bridge accomodates new implementations as the system evolves.
* Bridge is used when upfront the knowlegde is available that an abstraction must have several implementations, and both may evolve independently. 
* Bridge makes things work before they are designed.


# Composite VS Decorator VS Proxy
---
* Composite and Decorator have similar structure diagrams, reflexting the fact that both rely on recursive composition to organize an open-ended number of objects. This similarity ends at recursive composition because of different intent.
* Composite and Decorator intents are distinct but complementaty, because of this both are oftern used in concert. Both lead to design in which you can build applications just by plugging objects together without defining any new classes.
There will be an abstract class with some subclasses that are Composite, some that are Decorators and some that implement the fundamental building blocks of the system. In this case both patterns will have a common interface.
* Decorator let you add responsibilities to objects without subclassing. It avoids the explosion of subclasses that can arise from trying to cover every combination of responsibilities statically.
* Composite focuses on structuring classes so that many related objects can be treated uniformly, and multiple objects can be treated as one. Its focus in not on embellishment but on representation.
* Decorator sees the Composite as a ConcreteComponent.
* Composite sees the Decorator as a Leaf.
* Decorator and Proxy also have a similar structure. Both describe how to provide a level of indirection to an object, and the implementation of both keep a reference to another object to which they forward requests. But again their intent is different.
* Decorator and Proxy both compose an object and provide an identical interface to its clients.
* Proxy is not concerned with attaching or detaching properties dynamically, and it's not designed for recursive composition.
* Proxy is intended to provide a stand-in for a subject whin it's inconcenient or undesirable to access the subject direcly because, e.g. it lives on a remote machine, has restricted access, or is persistent.
* Proxy provides(or refuses) access to the subject that defines the key functionality itself.
* Decorator is concerned with attaching or detaching properties dynamically, and it's designed for recursice composition.
* Decorator pattern, makes the component provide only part of the functionality, and one or more decorators funrnish the rest.
* Decorator addresses the situation where an object's total functionality can't be determined at compile time, at least not conveniently.

# Behavioral Patterns
---
### In plain words
> It is concerned with assignment of responsibilities between the objects. What makes them different from structural patterns is they don't just specify the structure but also outline the patterns for message passing/communication between them. Or in other words, they assist in answering "How to run a behavior in software component?"

### Wikipedia says
> In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

# Behavioral Pattern Types
* [Chain of Responsibility](#chain-of-responsibility)
* [Command](#command)
* [Iterator](#iterator)
* [Mediator](#mediator)
* [Memento](#memento)
* [Observer](#observer)
* [Visitor](#visitor)
* [Strategy](#strategy)
* [State](#state)
* [Template Method](#template-method)
* [Interpreter](#interpreter)

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. They describe not just patterns of objects or classes but also the patterns of communication between them.
Behavioral patterns characterize complex control flow that's difficult to follow at run-time. They shift the focus awau from flow of cntrol to let you concentrate just on the way objects are interconnected.

# Chain of Responsibility
---
## Bullet Points
* Use the Chain of Responsibility when:
	* more than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically.
	* you want to issue a request to one of several objects without specifying the receiver explicitly.
	* the set of objects that can handle a request should be specified dynamically.
* Decouples the sender of the request and its receivers.
* Simplifies your objects because it doesn't have to know the chain's structure and keep direct references to its members.
* Allows you to add or remove responsibilities dynamically by changing the members or order of the chain.
* Commonly used in windows systems to handle events like mouse clicks and keyboard events.
* Execution of the request isn't guaranteed; it may fall off the end of the chain if no object handles it.(this can be an advantage or disadvantage)
* Can be hard to observe the runtime characteristics and debug.

### Real world example
> For example, you have three payment methods (`A`, `B` and `C`) setup in your account; each having a different amount in it. `A` has 100 USD, `B` has 300 USD and `C` having 1000 USD and the preference for payments is chosen as `A` then `B` then `C`. You try to purchase something that is worth 210 USD. Using Chain of Responsibility, first of all account `A` will be checked if it can make the purchase, if yes purchase will be made and the chain will be broken. If not, request will move forward to account `B` checking for amount if yes chain will be broken otherwise the request will keep forwarding till it finds the suitable handler. Here `A`, `B` and `C` are links of the chain and the whole phenomenon is Chain of Responsibility.

### In plain words
> It helps building a chain of objects. Request enters from one end and keeps going from object to object till it finds the suitable handler.

### Wikipedia says
> In object-oriented design, the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain.

### Chain of Responsibility - definition
Avoid coupling the sender of a request to its receiver by giving more then one object a chance to handle the request.
Chain the receiving objects and pass the request along the chain until an object handles it.
Use the Chain of Responsibility Pattern when you want to give more than one object a chance to handle a request.

# Command
---
## Bullet Points
* Use the Command Pattern when you want to:
	* Parameterize objects by an antion to perform. You can express such parameterization in a procedural language with a callback function,
	that is, a function that's registered somewhere to be called at a later point. Commands are an object-oriented replacemant for callbacks.
	* Specify queue, and execute requests at different times. A Command object can have a lifetime independent of the original request.
	If the receiver of a request can be represented in an address space-independent way, you can transfer a command object for the request to a different
	process and fulfill the request there.
	* Support undo. The Command's execute operation can store state for reversing its effects in the command itself.
	The Command interface must have an added Unexecute operation that reverses the effects of a previous call to execute. Executed commands are stored in a history list.
	Unlimited-level undo and redo is archieved by traversing this list backwards and forwards calling unexecute and execute, respectively.
	* Support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface with load and store operations, you can keep a persistent log of changes.
	Recovering from a crash involves reloading logged commands from disk and re-executing them with the execute operation.
	* Structure a system around high-level operations build on primitive operations. Such a structure is common in informations systems that support transactions.
	A transaction encapsulates a set of changes to data. The Command pattern offers a way to model transactions. Commands have a common interface, letting you invoke all transactions the same way.
	The pattern also makes it easy to extend the system with new transactions.
* The Command Pattern decouples an object, making a request from the one that knows how to perform it.
* A Command Object is at the center of this decoupling and encapsulates a receiver with an action(or set of actions).
* An Invoker makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver.
* Commands may support undo by implementing an undo method that restores the object to its previous state before the execute() method was last called.
* Macro Commands are a simple extnsion of Command that allow multiple commands to be invoked. Likewise, Macro Commands can easily support undo().
* In practice, it is not uncommon for "smart" Commands objects to implement the request themselves rather then delegating to a receiver.
* Commands may also be used to implement logging and transactional systems.

### Real world example
> A generic example would be you ordering a food at restaurant. You (i.e. `Client`) ask the waiter (i.e. `Invoker`) to bring some food (i.e. `Command`) and waiter simply forwards the request to Chef (i.e. `Receiver`) who has the knowledge of what and how to cook. 
> Another example would be you (i.e. `Client`) switching on (i.e. `Command`) the television (i.e. `Receiver`) using a remote control (`Invoker`).

### In plain words
> Allows you to encapsulate actions in objects. The key idea behind this pattern is to provide the means to decouple client from receiver.

### Wikipedia says
> In object-oriented programming, the command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. This information includes the method name, the object that owns the method and values for the method parameters.

### Command - definition (Action, Transaction)
> Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

# Iterator
---
## Bullet Points
* An Iterator allows access to an aggregate's elements without exposing its internal structure.
* An Iterator takes the job of iterating over an aggregate and encapsulates it in another object.
* When using an Iterator, we relieve the aggregate of the responsibility of supporting operations for traversing its data.
* An Iterator provides a common interface for traversing the items of an aggregate, allowing you to use polymorphism when writing code that makes use of the items of the aggregate.

### Real world example
> An old radio set will be a good example of iterator, where user could start at some channel and then use next or previous buttons to go through the respective channels. Or take an example of MP3 player or a TV set where you could press the next and previous buttons to go through the consecutive channels or in other words they all provide an interface to iterate through the respective channels, songs or radio stations.  

### In plain words
> It presents a way to access the elements of an object without exposing the underlying presentation.

### Wikipedia says
> In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers; in some cases, algorithms are necessarily container-specific and thus cannot be decoupled.

### Iterator - definition (Cursor)
> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation


# Mediator
---
## Bullet Points
* Use the Mediator pattern when:
	* A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand.
	* Reusing an object is difficult because it refers to and communicates with many other objects.
	* A behavior that's distributed between several classes should be customizable without a lot of subclassing.
* Increases the reusability of the objects supported by the Mediator by decoupling them from the system. 
* Simplifies maintenance of the system by centralizing control logic.
* Simplifies and reduces the variety of messages sent between objects in the system.
* The Mediator is commonly used to coordinate related GUI components.
* A drawback of the Mediator Pattern is that without proper design, the Mediator object itself can become overly complex.

### Real world example
> A general example would be when you talk to someone on your mobile phone, there is a network provider sitting between you and them and your conversation goes through it instead of being directly sent. In this case network provider is mediator. 

### In plain words
> Mediator pattern adds a third party object (called mediator) to control the interaction between two objects (called colleagues). It helps reduce the coupling between the classes communicating with each other. Because now they don't need to have the knowledge of each other's implementation. 

### Wikipedia says
> In software engineering, the mediator pattern defines an object that encapsulates how a set of objects interact. This pattern is considered to be a behavioral pattern due to the way it can alter the program's running behavior.

### Mediator - definition
> Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
Use the Mediator Pattern to certralize complex communications and control between related objects.

# Memento
---
## Bullet Points
* Use the Memento Pattern when:
	* A snapshot of an object's state must be saved so that it can be restored to that state later, and
	* A direct interface to obtaining the state would expose implementation details and break the object's encapsulation.
* Keeping the saved state external from the key object helps to maintain cohesion.
* Keeps the key object's data encapsulated.
* Provides easy-to-implement recovery capability.
* The Memento is used to save state.
* A drawback to using Memento is that saving and restoring state can be time consuming.
* In Java systems, consider using Serialization to save a system's state.

### Real world example
> Take the example of calculator (i.e. originator), where whenever you perform some calculation the last calculation is saved in memory (i.e. memento) so that you can get back to it and maybe get it restored using some action buttons (i.e. caretaker). 

### In plain words
> Memento pattern is about capturing and storing the current state of an object in a manner that it can be restored later on in a smooth manner.

### Wikipedia says
> The memento pattern is a software design pattern that provides the ability to restore an object to its previous state (undo via rollback).

Usually useful when you need to provide some sort of undo functionality.

### Memento - definition (Token)
> Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
Use the Memento Pattern when you need to be able to return an object to one of its previous states; for instance, if your user requests an "undo"

# Observer
---
## Bullet Points
* Use the Observer Pattern in any of the following situations:
	* When an abstraction has two aspects, onde dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently.
	* When a change to one object requires changing others, and you don't know how many objects need to be changed.
	* When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't wnat these objects tightly coupled.
* The Observer Pattern defines a one-to-many relationship between objects.
* Subjects, or as we also know them Observables, update Observers using a common interface.
* You can push or pull data from the Observable when using the pattern (pull is considered more "correct").
* Don't depend on a specific order of notification for our Observers.
* Java has several implementations of the Observer Pattern, including the general purpose java.util.Observable.
* Watch out for issues with java.util.Observable implementation (not an interface, no composition over inheritance)
* Don't be afraid to create your own Observable implementation using an interface for example when needed.
* Swing makes heavy use of the Observer Pattern, as so do MVC frameworks.
* You'll also find the pattern in many other places, including JavaBeans and RMI.


### Real world example
> A good example would be the job seekers where they subscribe to some job posting site and they are notified whenever there is a matching job opportunity.   

### In plain words
> Defines a dependency between objects so that whenever an object changes its state, all its dependents are notified.

### Wikipedia says
> The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

### Observer - definition (Dependents, Publish-Subscribe)
> Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

# Visitor
---
## Bullet Points

### Real world example
> Consider someone visiting Dubai. They just need a way (i.e. visa) to enter Dubai. After arrival, they can come and visit any place in Dubai on their own without having to ask for permission or to do some leg work in order to visit any place here; just let them know of a place and they can visit it. Visitor pattern lets you do just that, it helps you add places to visit so that they can visit as much as they can without having to do any legwork.

### In plain words
> Visitor pattern lets you add further operations to objects without having to modify them.
    
### Wikipedia says
> In object-oriented programming and software engineering, the visitor design pattern is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to existing object structures without modifying those structures. It is one way to follow the open/closed principle.

### Visitor - definition

# Strategy
---
## Bullet Points
* Use the Strategy Pattern when:
	* Many related classes differ only in their behavior. Strategies provide a way to configure a class either one of many behaviors.
	* You need different variants of an algorithm. for example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
	* An algorithm uses data thet clients shouldn't know about. Use the Strategy Pattern to avoid exposing compex, algorithm-specific data structures.
	* A class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related condirional branches into their own Strategy class.

### Real world example
> Consider the example of sorting, we implemented bubble sort but the data started to grow and bubble sort started getting very slow. In order to tackle this we implemented Quick sort. But now although the quick sort algorithm was doing better for large datasets, it was very slow for smaller datasets. In order to handle this we implemented a strategy where for small datasets, bubble sort will be used and for larger, quick sort.

### In plain words
> Strategy pattern allows you to switch the algorithm or strategy based upon the situation.

### Wikipedia says
> In computer programming, the strategy pattern (also known as the policy pattern) is a behavioural software design pattern that enables an algorithm's behavior to be selected at runtime.
 
### Strategy - definition (Policy)
> Defines a familiy of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

# State
---
## Bullet Points
* Use the State Pattern in either of the following cases:
	* An object's behavior depends on its state, and it must change its behavior at run-time depending on that state;
	* Operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants.
	Often, several operations will contain this same conditional structure. The State Pattern puts each branch of the conditional in a separate class.
	This lets you treat the objects's state as an object in its own right that can vary independently from other objects.
* The State Pattern allows an object to have many differnt behaviors that are based on its internal state.
* Unlike a procedural state machine, the State Pattern represents state as a full-blown class.
* The Context gets its behavior by delegating to the current state object it is composed with.
* By encapsulating each state into a class, we localize any changes that wll need to be made.
* The State and Strategy Patterns have the same class diagram, but they differ in intent.
* Strategy Pattern typically configures Context classes with a behavior or algorithm.
* State Pattern allows a Context to change its behavior as the state of the Context changes.
* State transitions can be controlled by the State classes or by the Context classes.
* Using the State Pattern will typically result in a greater number of classes in your design.
* State classes may be shared among Context instances.

### Real world example
> Imagine you are using some drawing application, you choose the paint brush to draw. Now the brush changes its behavior based on the selected color i.e. if you have chosen red color it will draw in red, if blue then it will be in blue etc.  

### In plain words
> It lets you change the behavior of a class when the state changes.

### Wikipedia says
> The state pattern is a behavioral software design pattern that implements a state machine in an object-oriented way. With the state pattern, a state machine is implemented by implementing each individual state as a derived class of the state pattern interface, and implementing state transitions by invoking methods defined by the pattern's superclass.
> The state pattern can be interpreted as a strategy pattern which is able to switch the current strategy through invocations of methods defined in the pattern's interface.

### State - definition (Objects for states)
> Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

# Template Method
---
## Bullet Points

### Real world example
> Suppose we are getting some house built. The steps for building might look like 
> - Prepare the base of house
> - Build the walls
> - Add roof
> - Add other floors
> The order of these steps could never be changed i.e. you can't build the roof before building the walls etc but each of the steps could be modified for example walls can be made of wood or polyester or stone.
  
### In plain words
> Template method defines the skeleton of how a certain algorithm could be performed, but defers the implementation of those steps to the children classes.
 
### Wikipedia says
> In software engineering, the template method pattern is a behavioral design pattern that defines the program skeleton of an algorithm in an operation, deferring some steps to subclasses. It lets one redefine certain steps of an algorithm without changing the algorithm's structure.

### Template Method - definition

# Interpreter
---
## Bullet Points
* Use the Interpreter Pattern when there is a language to interpret, and you can represent statements in the language as abstract syntax trees. The Interpreter Pattern works best when:
	* The grammar is simple. For coplex grammars, the class hierarchy for the grammar becomes large and unmanageble
	Tools such as parser generators are a better alternative in such cases. they can interpret expressions without building abstract syntax trees, which can save space and possible time.
	*	Efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting
	parse trees directly but by first translating them into another form. For example, regular expressions are often transformed into state machines.
	But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable.

## Interpreter Method - definition
> Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.







