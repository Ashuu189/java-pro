package Test;
import Inheritance.Vehicle;
public class testMain {
    public static void main(String[] args) {
        Vehicle V=new Vehicle("hayabusa", "2027");
        System.out.println(V.name);

        V.engineStart();
    }
}
