package Set;
import java.util.*;
public class linkedHashSet {
   public static void main(String[] args) {
    //LinkedHashSet is a class that implements the Set interface and extends the HashSet class. 
    //It maintains a linked list of the entries in the set, in the order in which they were inserted. 
    //This allows it to maintain the insertion order of the elements in the set.

    //Hashset -> 0(1) insertion and deletion, unordered, not sorted
    //linkedHashSet -> o(n) insertion and deletion, ordered, not sorted
    //TreeSet -> o(log n) insertion and deletion, sorted

    Set<Integer> set= new LinkedHashSet<>();
    set.add(2);
    set.add(2);
    
    set.add(1);
    set.add(1);
    set.add(1);

    

    set.add(3);

    System.out.println(set);

    Iterator<Integer> iterator= set.iterator();

    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
   }
}
