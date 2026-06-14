package ListInterface;
import java.util.*;

public class vector {
    public static void main(String[] args) {
        List <Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println(v);
        v.add(3,31);
        System.out.println(v);

     Object [] arr= v.toArray();
     for(Object value:arr){
        System.out.println(value+ " ");
     }
     
     //All the methods of list or arraylist will work in vector except linked list specific methods like addFirst(), addLast, removeFirst(), removeLast(), peek(), poll(), offer(), getFirst(), getLast() etc.
    }
   
}
