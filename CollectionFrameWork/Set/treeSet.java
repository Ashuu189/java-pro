package Set;
import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        Set<Integer> set= new TreeSet<>();
    set.add(2);
    set.add(2);
    
    set.add(1);
    set.add(1);
    set.add(1);

    

    set.add(3);

    System.out.println(set);

    // Iterator<Integer> iterator= set.iterator();

    // while(iterator.hasNext()){
    //     System.out.println(iterator.next());
    // }

    // Union-> addAll()
    // Insertion-> retainAll()
    // Difference-> removeAll()
    // Subset-> containsAll()

    //new ways to make set
        //     Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        // Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7));

        // Set<Integer> difference = new HashSet<>(setA);

        // Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        // Set<Integer> setB = Set.of(4, 5, 6, 7);

   }
 }

