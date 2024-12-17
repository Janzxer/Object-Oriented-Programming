************
* Objects  
************

Attributes are sometimes called as variables, properties or fields.
Though for example a property is a bit different than an attribute

Attributes are quite like the variables.

Object can have attributes like:

Fiat object attributes:

speed = 80
numberOfDoors = 4

Objects can do something, for example change the values of its attributes. These procedures/actions/behaviors are called methods.

Fiat object methods:
Accelerate
Start

**************************
* App created using OOP  
**************************

Object is like a part og a machine for example a dishwasher

Every object has a role:

Object 1 knows everything
Object 2 validates the data
Object 3 prints

![Roles](<Images/Flow of roles.png>)

************
*   Class  
************

Every object is an instance of a class.

Class itself is nothing, class is a blueprint more of a blueprint for creating objects.

Class defines common attributes and methods of an object.

![Class example](<Images/Class example.png>)

From class objects can be created.

![Object example](<Images/Object example.png>)

********************
*   Class diagram  
********************

When planning a class it's good to make a class diagram to set the initial idea for what the class does.

The diagram is made of 3 parts: Name of the class, attributes of the class and the methods of the class.

In the first box we have the name of the class, and it starts with the uppercase letter and usually it is centered.
The attributes of the class goes in the second box and start with a lowercase letter.
The methods go in the third box and in Java methods also start with lowercase letter, but for example in C# the methods start with uppercase letter.

![Class diagram](<Images/Class diagram.png>)


********************
*   Constructor  
********************

Constructor is a method, that is used to create an object.
If you don't create constructor for your class, compiler will create one for you and this is called "Default constructor" (oletusrakentaja)

To define how object is initialized, you can define the constructor by yourself
    The name of the constructor and the class must be same
    You cannot add void to it
    Constructor can't return anything
    Constructor can take arguments and this is called a "Parameterized Constructor" (parametrinen rakentaja)
    You can also define the funtionality of parameterless constructor

There can be multiple constructors within the same class
    All the constructors in the same class will have the same name, but different number of parameters
    Which constructor is called, depends on how many arguments it is given when calling the constructor
    Method Overloading (metodin kuormitus) is a feature that allows a class to have more than one method with the same name, if their parameters are different. Method overloading can be used with constructors but also with "normal" methods.

********************
*   Encapsulation  
********************

Usually all the attributes are made private thus can only be accessed within the class. Constructor needs to be public since that will be called outside of the class.

![Example of encapsulation](<Images/Visual for encapsulation.png>)

The default is that we hide every attribute and method, and after that we need to think which attributes and methods are required to be public for other classes and objects.

The idea is that the person who uses the encapsulated class doesn't need to know how the class works, only how to use the class. For example what public methods, getters and setters.

The benefits of encapsulation is that it simplifies the maintenance of the application by allowing us to modify the methods and classes safely. This also increases reusability, by allowing us to more easily use the classes in other applications.

![Encapsulation in practice](<Images/Encapsulation in practice.png>)


Accessors - Getter and Setter methods

Usually all the attributes should be private, and with accessors we can read and assing the desired values.
    Getter - Reads the values of the private attributes using a getter method
    Setter - Assings the values of the private attributes using a setter method

Get and set methods are basically quite normal methods.

![Example of setter and getter](<Images/Getter and Setter example.png>)


Access Modifiers

private and public are basic modifiers in Object Oriented Programming. There is also 2 more modifiers, protected and default, but those are not in the scope of the course.



********************
*   Inheritance  
********************

Basically there is 2 classes, which are Parent class/superclass (kantaluokka) and child class/subclass (aliluokka).

Parent class usually have basic attributes and methods, which the subclasses inherit. When adding attributes or methods to the parent class the subclasses inherit those.

In class diagrams the inheritance arrows are drawn from child to parent. Only public attributes and methods can be inherited. One possible way to allow inheritance is to use protected, instead of public.

A class can be created so that it inherits attributes and methods from another calss.

Subclasses can have new attributes and methods.

Subclass is usually more specific or detailed version of usually more generic superclass.

Subclass can inherit a method. In subclass we can change the actions/logic of the method by overrideing it.

Private attributes and methods can't be inherited.
Public (and protected) attributes and methods can be inherited.
Constructors aren't inherited.

Advantages of inheritance is that code can be reused (less code).

Inheritance can also be overused which makes the program more complex, and that can be also a disadvantage.

********************
*   Static members
********************

Static attribute values are the same for all the objects made from the class. Static attributes can only be accessed through the class and not through the object.

Methods can also be static, and when calling static methods you need to use the class and not the object.

In non-static methods, static and non-static attributes can be used. In static methods, only static attributes can be used. The same goes for methods.

Static attributes and methods can be used when the values need to be same for all the objects.

Static attributes and methods can be called without object, via the class.


**************************************
*   Calling methods from another class
**************************************

To call methods in other classes, we need to send the object as an argument to the method. Then we need to change the method parameter to reflect the sent argument.

For example:

pacman.eat(fruit1); Within the brackets is the object that we are sending to the eat method. fruit1 is an object created from the "Fruit" class.

In the eat method we do the following:

public void eat(Fruit eatenFruit) First we declare the Fruit as a parameter for the eat method, then we give it a "value" this will be "eatenFruit"

With the eatenFruit we can call the method "dissapear"

eatenFruit.disappear();

******************
*   Abstract class
******************

Abstract class can be used when creating a class that has no reason to make objects out of. For example abstract class could be "Furniture" or "Shape", we could make subclasses for those like "Chair, Table, Shelf, or Square, Rectangle, Circle".

The abstract class could have very generic attributes and methods, for example an attribute could be price, size, colour, material etc. which can be inherited to the subclasses.

When to use abstract class?

When we know that we need a specific method, but don't know how to implement it in practice.

Or we know that the method functions differently in all the subclasses.

For example, with method calculateArea, it is very different for "Circle" and "Rectangle"

Abstract method just declares that the method should be in the subclass but does not give any content for it. Subclass needs to daclare methods functionality.

If even one method in the class is abstract, the class must be abstract.

Abstract method does not have a body (There isn't an actual funtionality/code) it is just a declaration of to be method

A constructor cannot be abstract

All the abstract methods must be coded and overridden in the subclass

There can be also normal methods in abstract class and constructors



******************
*   Interface
******************

You always need to inherit class from the interface to create object from it.

Interface is like an abstract class taken further, all methods in interface are abstract.

Class can inherit several interfaces. For example, class inherits three interfaces, and all the methods of the different interfaces are coded in the class.

Interface can have methods (also getters and setter), but no attributes.

In code, all the methods are abstract, even if you don't mark them abstract. There can't be any normal methods or attributes, and with interface when inheriting the keyword used is "implements" instead of "extends". The implementing class must declare the methods functionalities.
