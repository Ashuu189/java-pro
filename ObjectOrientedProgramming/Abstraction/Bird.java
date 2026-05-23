package Abstraction;
//Abstraction in java:

//1. Delvering only essential information to the user and hiding the details is called abstraction. 
// It is one of the fundamental OOP concepts in Java.

//2. It is a design and programming method that sepreated the interface with the implementation.

//3. Real life e.g. varius functionalities of airpods, but dont know the acutal implementations.

//4. to drve a car, we only need to know how to drive a car, we dont need to care about how engine works.

//Design strategy:

//1. Abstraction divides code into two categories: interface and implemetation. So, when 
//creating your component, keep interface and implementation separate.
//  This way, you can change the implementation without affecting the interface, and vice versa.

//2. In this instance, any program that these interfaces would remain unaffected and would require recompilation with the most recent implementation.

//3. makes the code modular and maintainable.
abstract class Bird {
    abstract void fly();
    abstract void eat();
}
