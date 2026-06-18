package comparator;
import java.util.*;
public class comparator {
    public static void main(String[] args) {
        // List<Integer> list= new ArrayList<>();
        // list.add(5);
        // list.add(2);
        // list.add(8);
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);

        Student s1= new Student(20, "John", 70);
        Student s2= new Student(20, "Alice", 60);
        Student s3= new Student(19, "Bob", 80);
        Student s4= new Student(21, "Eve", 65);
        List<Student> list= new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        // System.out.println(list);

        Collections.sort(list, new weightComparator());
    
      System.out.println(list);

    }

}

