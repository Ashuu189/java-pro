package Abstraction;

interface Bird{
    void eat();
    void fly();
}

class Sparrow implements Bird{

    @Override
    public void eat() {
      System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Crow implements Bird{
   @Override
    public void eat() {
      System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}

public class Interface {
    public static void main(String[] args) {
        Bird b= new Sparrow();
        b.eat();
        b.eat();
        b=new Crow();
        b.eat();
        b.fly();
    }
    
}
