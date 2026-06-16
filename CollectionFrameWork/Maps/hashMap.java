package Maps;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        Map<String, String> map1= new HashMap<>();

        //put() is used to insert the value in the map
        map1.put("en","england" );
        map1.put("in","india" );
        map1.put("br","brazil" );
        map1.put("us","united states" );

        //if we try to add duplicate value in this
        //so it will just update the value not the key

        // map1.put("en","estonia");
        // System.out.println(map1);

        Map<String, String> map2= new HashMap<>();
        map2.put("ug", "uganda");

        // System.out.println("before" + map2);

        //putAll() is used to add all the elements of one map to another
        map2.putAll(map1);

        // System.out.println(map2);

        //remove(key) is used to delete specified key value pair
        // map2.remove("in");
        // System.out.println(map2);

        //clear() is used to clear all the entries from the map
        // map2.clear();
        // System.out.println(map2);

        //size is used to get the size of the map
        // System.out.println(map2.size());

        //putIfAbsent() is used to add the record in the map if the value is not present the map. 
        // if the key is present already in the map then it will not update the value.

        // map2.putIfAbsent("is","india2");
        // System.out.println(map2);

        //get() is used to get the value of the specified key
        // System.out.println(map2.get("in"));

        //getOrDefault() is used to get the value of the specified key.
        //  if the key is not present in the map then it will return the default value which we have specified in the function.

        // System.out.println(map2.getOrDefault("usa", "none"));

        // System.out.println(map2.containsKey("in"));
        // System.out.println(map2.containsKey("ini"));

        // System.out.println(map2.containsValue("india"));
        // System.out.println(map2.containsValue("india2"));

        System.out.println(map2);

        //replace() is used to replace the value of the specified key.
        // if the key is not present in the map then it will not update the value.
        // map2.replace("in", "indonasia");
        // System.out.println(map2);

        //map2.keySet() is used to get the set of keys from the map.
        //  System.out.println(map2.keySet());
        //  Set<String> keyset= map2.keySet();
        //  System.out.println(keyset);

         //map2.values() is used to get the collection of values from the map.
        //  Collection<String> values= map2.values();
        //     System.out.println(values);

        //map2.entrySet() is used to get the set of key value pairs from the map.
     Set<Map.Entry<String, String>> entries= map2.entrySet();
     System.out.println(entries);


    }
}
