package ListInterface;
import java.util.*;
public class stack {
   public static void main(String[] args) {
    Stack<Integer> s= new Stack<>();
    //All the methodds of vector will work in stack except the methods of linked list like addFirst(), addLast, removeFirst(), removeLast(), peek(), poll(), offer(), getFirst(), getLast() etc.

    //push() method is used to add an element to the top of the stack.
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(50);
      s.push(60);
    System.out.println(s);

   //pop() method is used to remove an element from the top or last of the stack.
      s.pop();
    System.out.println(s);

    //peek() method is used to get the top or last element of the stack without removing it.
      System.out.println(s.peek());

      //search() method is used to search for an element in the stack and returns its position from the top of the stack. 
      // If the element is not found, it returns -1.
      System.out.println(s.search(60));
      System.out.println(s.search(50));

      //empty() method is used to check if the stack is empty or not,
      //  it returns true if the stack is empty and false if the stack is not empty.
      System.out.println(s.empty());

   } 

}
