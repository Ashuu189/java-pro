package Polymorphism;
public class Main {
   public static void main(String[] args) {
    Lion lion = new Lion();
   //  lion.sound();

    Rect r=new Rect();

   //  r.sound();

    makeSound(lion);
    makeSound(r); 
   }

   //Dynamic Method Dispatch[Upcasting]- A Superclass refrence variable can refer to a 
   //subclass object and dynamic dispatch is used to resolve the called method at runtime.
   public static void makeSound(Animal a){
    a.sound();
   }
}
