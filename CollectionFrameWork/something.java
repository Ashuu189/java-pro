package CollectionFrameWork;
import java.util.*;
public class something {
    public static void main(String[] args) {
      // List <Integer> list =new ArrayList<>();
      // list.add(10);
      // list.add(20);
      // list.add(30);
      // list.add(40);

      // List <Integer> list2 =new ArrayList<>();
      // list2.add(50);
      // list2.add(60);
      // list2.add(70);
      // list2.add(80);

      // list.addAll(list2);
      //   System.out.println(list);

      //   list.removeAll(list2);
      //   System.out.println(list);

        // for(int i=0;i<list.size();i++){
        //   System.out.println(list.get(i));
        // }

        // Iterator<Integer> iterator= list.iterator();
        // while(iterator.hasNext()){
        //   // System.out.println(iterator.next());
        // }

        ArrayList <Integer> list= new ArrayList<>();
        list.add(25);
        list.add(26);
        list.add(27);

        // System.out.println(list.get(0));

        ArrayList <Integer> newList= (ArrayList<Integer>) list.clone();
        System.out.println(newList);
 
        

        

    }
   
}