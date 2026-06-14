package ListInterface;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
    // ArrayList<Integer> list= new ArrayList<>();

    //add function
    // list.add(10);
    // list.add(20);
    // list.add(30);
    // System.out.println(list);
    //  list.add(40);
    //  System.out.println(list);

    //  remove function
    //  list.remove(1);
        // System.out.println(list);


    // List<Integer> list2= new ArrayList<>();
    // list2.add(70);
    // list2.add(80);
    // list2.add(90);
    // list2.add(100);
    // System.out.println(list2);

    //Add All function
    // list.addAll(list2);
    // System.out.println(list);

    //remove all function
    // list.removeAll(list2);
    // System.out.println(list);

    //size function
    // System.out.println(list.size());

    //removing all element from the list 
    // System.out.println("Printing all elements of list 2: "+list2);
    // list2.clear();
    // System.out.println(list2.size());

    //get function
    // System.out.println(list.get(0));

    //Iterator
// System.out.println("Traversing elements of list 1");
//     Iterator<Integer> iterator=list.iterator();
//     while(iterator.hasNext()){
//         System.out.println("Element:" + iterator.next());
//     }

//     System.out.println("Traversing elements of list 2");

//     Iterator<Integer> iterator2=list2.iterator();
//     while(iterator2.hasNext()){
//         System.out.println("Element:"+iterator2.next());
//     }

        //get element in the list
        ArrayList<Integer> list3= new ArrayList<>();
        list3.add(7);
        list3.add(5);
        list3.add(6);

        // System.out.println("Element at the index"+list3.get(0));

        //setting element in the list
        // System.out.println("before set"+list3);
        // list3.set(0,50);

        // System.out.println("After set"+list3);

        // toArray() function
        // Object[] arr= list3.toArray();
        // for(Object value:arr){
        //     System.out.println(value);
        // }

        //contains function
        // System.out.println(list3.contains(6));
        // System.out.println(list3.contains(1000));

// list3.add(1);
// System.out.println(list3);
  
//sort function= it will sort the list in ascending order
// Collections.sort(list3);
// System.out.println(list3);

//Sorting in reverse or descending order
// Collections.sort(list3, Collections.reverseOrder());
// System.out.println(list3);

//clone function -> used to clone the list by doing type casting
// ArrayList<Integer> newList= (ArrayList<Integer>) list3.clone();
    // System.out.println(newList);

// ArrayList<Integer> marks= new ArrayList<>();

//ensureCapacity function -> it is used to increase the capacity of the list
// marks.ensureCapacity(100);

//isEmpty function -> it is used to check whether the list is empty or not
// System.out.println(list3.isEmpty());

//indexOf function -> it is used to find the index of the first occurrence of the specified element in the list
// System.out.println(list3.indexOf(6));

    }  


}
