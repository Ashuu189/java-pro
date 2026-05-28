package Polymorphism;

public class Calculator {
    //method overloading is a part of static polymorphism and its a compile time polymorphism
    //methods Overloading occurs when a class contains multiple methods 
    // sharing a name but differing in argument count or argument type.

    public int add(int a, int b){
        return a + b;
    }

    //overloaded method
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(int a, int b, int c, double d){
        return a + b + c + d;
    }

    //Java does not support user-defined operator overloading 
    //but internally overloads certain operators(e.g., + for String concatenation and integer addition).

    
}
