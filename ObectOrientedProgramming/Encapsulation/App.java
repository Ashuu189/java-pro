package Encapsulation;

public class App {
    public static void main(String[] args) {
        Student A= new Student(1,"Ashutosh",22,5,"Priya");
        Student B= new Student(A);
        // A.name="Ashutosh";
        // A.id=1;
        // A.age=20;
        // A.nos=5;
        // System.out.println("Name: " + A.name);
        // System.out.println("ID: " + A.id);
        // System.out.println("Age: " + A.age);
        // System.out.println("Number of Subjects: " + A.nos);

        System.out.println(B.name);
        System.out.println(B.id);
        // System.out.println(B.age);
        System.out.println(B.nos);
        // System.out.println(B.gf);

        // A.studying();
        // A.sleeping();

        System.out.println(B.getGfName());

        System.out.println(B.setAge(52));

        System.out.println(B.getAge());

        B.display();
    }
}
