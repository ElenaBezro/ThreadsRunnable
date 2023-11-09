Single responsibility
Exercise 1:
Imagine a class Dog that barks and eats. Separate these behaviors into two classes: DogSound and DogFood.

Exercise 2:
You have a Student class that calculates grades and prints report cards. Create separate classes for grade calculation and report card printing.

Exercise 3:
Consider a Library class that manages book inventory and handles user memberships. Split these responsibilities into separate classes: BookInventory and UserMembership.

Exercise 4:
Imagine a Cafeteria class that prepares food and also handles billing. Split these responsibilities into separate classes: FoodPreparation and Billing.

Open/close

Exercise 1:
Create a class Animal with a method makeSound(). Extend this class to create Dog and Cat classes. Ensure that you can add more animals without changing the Animal class.

Exercise 2:
You have a Shape class with Circle and Square subclasses. Write a PerimeterCalculator class that can calculate the perimeter of different shapes without modifying existing classes.

Exercise 3:
Create a Person class with a method introduceYourself(). Extend this class to create Student and Teacher classes, ensuring that introducing new types of people doesn't require modifying the Person class.

Exercise 4:
Create a Greeting class with a method sayHello(). Extend this class to create FormalGreeting and CasualGreeting classes, ensuring that adding new greeting styles doesn't require modifying the Greeting class.

Liskov substitution

Exercise 1:
Given a class Bird with a method fly(), ensure that subclasses like Penguin and Sparrow can be used interchangeably without causing errors.

Exercise 2:
Create a class Student with a method study(). Ensure that subclasses like UndergraduateStudent and GraduateStudent can be used interchangeably with consistent behaviors.

Exercise 3:
You have a Vehicle class with a method startEngine(). Ensure that subclasses like Car and Bicycle (which doesn't have an engine) can be used interchangeably without causing errors.

Exercise 4:
You have a Flower class with a method bloom(). Ensure that subclasses like Rose and Cactus (which blooms rarely) can be used interchangeably without causing errors.

Interface segregation

Exercise 1:
Imagine an interface Person with methods study(), work(), and play(). Break it down so that Student and Worker classes can implement only the methods relevant to them.

Exercise 2:
You have an interface AnimalBehavior with methods fly(), swim(), and run(). Split this interface so that Fish, Bird, and Dog classes don't implement irrelevant methods.

Exercise 3:
Imagine a SchoolMember interface with methods attendClasses(), giveLectures(), and payFees(). Break it down into smaller interfaces so that Student and Teacher classes can implement only the methods relevant to them.

Exercise 4:
You have an ElectronicDevice interface with methods turnOn(), turnOff(), charge(), and playMusic(). Break it down so that Smartphone and TableLamp classes don't have to implement irrelevant methods.

Dependency Inversion

Exercise 1:
You have a Switch class controlling a LightBulb. Refactor it so that the switch can control any device (e.g., Fan, Heater) by depending on an abstraction.

Exercise 2:
Create a BookReader class that reads from a Book. Modify it so that it can read from any source (e.g., Magazine, Newspaper) by depending on an abstraction.

Exercise 3:
You have a MusicPlayer class that plays songs from a CD. Modify it so that it can play music from any source (e.g., USB, StreamingService) by depending on an abstraction.

Exercise 4:
You have a NotificationSender class that sends notifications via Email. Modify it so that it can send notifications through any medium (e.g., SMS, PushNotification) by depending on an abstraction.