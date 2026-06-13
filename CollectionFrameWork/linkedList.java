package CollectionFrameWork;
import java.util.*;
public class linkedList {
public static void main(String[] args) {
    List <Integer> list=new LinkedList<>();

    //list.add() is used to add element in a linked list.
    list.add(30);
    list.add(10);
    list.add(30);
    list.add(20);
    list.add(30);
    // System.out.println(list);

    //iterating a linked list using for loop
    // for(int i=0;i< list.size();i++){
    //     System.out.print(list.get(i)+ " ");
    // }

    //list.toArray() is used to convert a linked list to an array.
    // Object [] arr= list.toArray();

    // for(Object value:arr){
    //     System.out.println(value);

    // }

    //all function can be runnable in linked list except the clone function. 

    //list.remove() is used to remove an element from a linked list.
    // list.remove(0);
    // System.out.println(list);

    //list.size() is used to find the size of a linked list.

    //iterator is used to iterate or traverse a linked list or list interface in collection framework.
    // Iterator<Integer> iterator= list.iterator();

    // while(iterator.hasNext()){
    //     System.out.print(iterator.next()+" ");
    // }

    //list.get() is used to get an element from a linked list based on the index.
    //  System.out.println(list.get(2));

    //list.set() is used to set an element at a specific index in a linked list.
    // list.set(2, 101);
    // System.out.println(list);

    //Collections.sort() is used to sort the elements of a linked list in ascending order.
    // Collections.sort(list);
    // System.out.println(list);
    
    //Sorting in reverse or descending order
    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);

    //Clone() function cannot be implemented in linked list because it is not a cloneable interface.

     //list.lastIndexOf() is used to find the last occurrence of an element.

    // System.out.println(list.lastIndexOf(30));

    //addFirst() function is used to add an element at the beginning of a linked list.
    // list.addFirst(108);
    // System.out.println(list);

    //addLast() function is used to add an element at the end of a linked list.
    // list.addLast(108);
    // System.out.println(list);
 
    // LinkedList <Integer> ll= new LinkedList <>();
    // ll.add(10);
    // System.out.println(ll);

    //ll.addFirst(); is used to add element in the front
    // ll.addFirst(2);
    // System.out.println(ll);

    //ll.addLast(); is used to add element in the end
    // ll.addFirst(9);
    // ll.addLast(11);
    // System.out.println(ll);

    //removeFirst() is used to remove the first element of a linked list.
    // ll.removeFirst();

    //removeLast() is used to remove the last element of a linked list.
    // ll.removeLast();

    //getFirst() is used to get the first element of a linked list.
    //ll.getFirst();

    //getLast() is used to get the last element of a linked list.
    // ll.getLast();

    //peek() is used to get the head of a linked list without removing it.
    // System.out.println(ll.peek());

    //poll() returns the first element of the linked list and then removes that element.
    //before poll
    // System.out.println(ll);

    // ll.poll();

    //after poll
    // System.out.println(ll);

    //offer() is used to add an element to the end of a linked list.
    // ll.offer(12);
    // System.out.println(ll);


}
}   
