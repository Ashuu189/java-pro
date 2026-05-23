package Abstraction;

public class main {
    public static void main(String[] args) {
        Bird b= new sparrow();
        b.eat();
        b.fly();

        b= new crow();
        b.eat();
        b.fly();

    }
}
