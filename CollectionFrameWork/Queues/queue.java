package Queues;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        // Queue<Integer> q= new LinkedList<>();
        //add() function inserts the specified element into the queue.
        //if the task is successful. add() returns true, if not it throws an exception.
        // q.add(10);
        //  q.add(20);
        //   q.add(30);
        //    q.add(40);
        //     q.add(50);
        
        // System.out.println(q);

        //offer() inserts the specified element into the queue. if the task is successful then it returns true, else it returns false.
        // q.offer(60);
        // q.offer(70);
        // q.offer(80);
        // q.offer(90);
        // q.offer(100);
        // System.out.println(q);

        //element() function returns the first element or head or the front element of the queue. 
        //if the queue is empty then it throws an exception. 
        // System.out.println(q.element());

        //peek() function returns the first element or head or the front element of the queue.
        // if the queue is empty then it returns null.
        // System.out.println(q.peek());

        // remove() function removes the first element or the head of the queue or the front element of the queue. 
        // if the queue is empty then it throws an exception.
        // System.out.println(q.remove());
        // System.out.println(q);

        //poll() function returns the front element then removes the first element or the head element of the queue or the front of the queue. 
        //if the queue is empty then it return null.
        // System.out.println(q.poll());
        // System.out.println(q);

        //note: when we are using the queue we're going to solve dsa questions we use offer to add, 
        // peek to get front element and poll to remove the front element. because they do not give exceptions.
        //  So we don't need to handle exceptions.

        // Deque<Integer> dq= new LinkedList<>();
        // dq.offer(10);
        // System.out.println(dq);
        // dq.offerFirst(5);
        // System.out.println(dq);
        // dq.offerLast(15);
        // System.out.println(dq);
        // dq.pollFirst();
        // System.out.println(dq);
        // dq.pollLast();
        // System.out.println(dq);
        // dq.peekFirst();
        // System.out.println(dq);
        // dq.peekLast();
        // System.out.println(dq);
  
        // ArrayDeque is a resizable array implementation of the Deque interface.
        // It provides a more efficient implementation of the Deque interface than LinkedList.
        //It deque can implement both stack and queue. 
        // It does not allow null elements. It is not thread safe. It is faster than LinkedList.  

        // Deque<Integer> adq= new ArrayDeque<>();
        // // adq.push(10);
        // // adq.push(20);
        // // adq.push(30);
        // System.out.println(adq);

        // System.out.println(adq.element());



        // Iterator<Integer> it= adq.iterator();

        // Queue<Integer> pdq= new PriorityQueue<>();

        //default behavior of the priority queue is min heap. it means the smallest element in the queue will be removed first. 
        // if we want to change the behavior to max heap then we can use the comparator.
        // pdq.offer(10);
        // pdq.offer(20);
        // pdq.offer(15);


        // int temp= pdq.poll();
        // System.out.println(temp);


        //now by adding this comparator we can change the behavior of the priority queue to max heap. 
        // it means the largest element in the queue will be removed first.

        // Queue<Integer> pdqm= new PriorityQueue<>((a,b)-> b-a);
        //another way to do this

        // Queue<Integer> pdq= new PriorityQueue<>(Collections.reverseOrder());

        // pdqm.offer(10);
        // pdqm.offer(20);
        // pdqm.offer(15);

        // int temp= pdqm.poll();
        // System.out.println(temp);


    }
}
