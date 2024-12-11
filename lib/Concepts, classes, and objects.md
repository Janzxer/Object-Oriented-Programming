A class is essentially nothing more than a blueprint. The same class/blueprint can be used multiple times, allowing the creation of different objects based on the same foundation.

An object is an item or entity created from a class. For example, if the class is a Vacuum, you could create blue, red, or even yellow vacuums from that class.

Attributes provide the parameters used within the class when creating objects. For instance, a vacuum could be created as the following object:

Brand: Dyson
Model: TX-550
Power: 650W
Colour: Red

Methods are actions that an object created from a class can perform. Let's use the example of that Dyson vacuum:

Turn on: This would be a Boolean value, meaning the vacuum is either on or off.

Adjust power: I would make this an Integer value, for example, ranging from 20% to 100%. Power could be adjusted in increments of 20%, with possible values being 20, 40, 60, 80, and 100.

Extend/shorten: Adjusting the length of the handle could also be an Integer value between 1 and 10. Let's assume each increment or decrement changes the length by 10 cm. While this is typically adjusted manually, it could be programmed, similar to how hair clippers are adjusted.

Reel cord: This could be a Boolean value, as the power cord is either being reeled in or not.

Class diagram of the vacuum:
___________________
|      Vacuum     |
|_________________|
|brand            |
|model            |
|power            |
|colour           |
|_________________|
|turnOn()         |
|adjustPower      |
|extendShorten    |
|reelCord         |
|_________________|

So, a class itself is not something tangible; it is merely a blueprint defining the attributes and functions a future object can have, such as model, brand, color, or actions like turning the device on, adjusting the power, and turning it off.
An object, then, is a tangible instance created from that class, such as the Dyson vacuum cleaner, which has 650W of power and 5 different suction levels.