package Polymorphism;

public class Lion extends Animal {
//runtime polymorphism
    //Function overriding - A Subclass can provide its specific implementation of a method that is defined in the parent or superclass.
    @Override
    public void sound(){
        System.out.println("Lion is roaring");
    }
}
