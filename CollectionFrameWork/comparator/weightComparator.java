package comparator;
import java.util.*;
public class weightComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
         return o1.weight - o2.weight;
    }
    
}
