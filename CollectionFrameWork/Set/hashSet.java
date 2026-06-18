package Set;
import java.util.*;
public class hashSet {
   public static void main(String[] args) {

    //Most important point about the set is that it does not allow duplicate elements.
    //another point is that it does not remember the index of the elements. 
    // it does not maintain the order of the elements.
     //indexing is not poosible in set because 
     // it does not maintain the order of the elements.
   //  Set<Integer> set= new HashSet<>();
    // set.add(2);
    // set.add(2);
    
    // set.add(1);
    // set.add(1);
    // set.add(1);

    

    // set.add(3);

    // System.out.println(set);

    // Iterator<Integer> iterator= set.iterator();

    // while(iterator.hasNext()){
    //     System.out.println(iterator.next());
    // }


   //  Set<Integer> set1= new HashSet<>();
   //  Set<Integer> set2= new HashSet<>();

   //  set1.add(1);
   //  set1.add(2);
   //  set1.add(3);
   //  set1.add(4);

   //  set2.add(3);
   //  set2.add(4);
   //  set2.add(5);
   //  set2.add(6);

    //retainAll function is used to find the common elements between two sets. 
    //It modifies the original set (set1 in this case) to retain only the elements that are present in both sets.
    //It is basically performing the intersection of two sets.
   //  set1.retainAll(set2);
   //  System.out.println(set1);

    //containsAll function is used to check if the set is containing 
    //all the elements of other set or not. if it contains then it returns true else returns false.
    // set1.containsAll(set2);
   // 
   
   Set<Student> students= new HashSet<>();

   Student s1= new Student(1, "John");
   Student s2= new Student(1, "John");
   Student s3= new Student(1, "John");

    
   students.add(s1);
   students.add(s2);
   students.add(s3);

   System.out.println(students);

   //In the above code we have created three student objects with same roll number and name.
   //but when we added them to the set, only one object is added to the set because we have overridden the hashCode and equals method in the Student class. 
   //so when we try to add the second and third student object to the set, it checks the hashCode and equals method of the Student class and finds that they are same as the first student object, so it does not add them to the set.
   //if we have not overridden the hashCode and equals method in the Student class, then all three student objects will be added to the set because the default implementation of hashCode and equals method in the Object class will be used, which will consider all three student objects as different objects because they are different instances of the Student class.
   //so it is important to override the hashCode and equals method in the Student class to ensure that the set does not allow duplicate student objects based on their roll number and name.
   //In the above code we have overridden the hashCode and equals method in the Student class to ensure that the set does not allow duplicate student objects based on their roll number and name.
   //
   }

 

    
}
