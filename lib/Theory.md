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

