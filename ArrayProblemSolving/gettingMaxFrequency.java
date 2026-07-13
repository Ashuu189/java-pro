package ArrayProblemSolving;

import java.util.HashMap;

public class gettingMaxFrequency {

    public static int getMaxFrequency(int []arr){
       
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // for(int key: map.keySet()){
        //     System.out.println(key + "->" + map.get(key));
        // }

        int currentMax=-1;
        int currentMaxKey=-1;
        for(int key: map.keySet()){
            if(map.get(key) > currentMax){
                currentMax = map.get(key);
                currentMaxKey = key;
            }
        }

        return currentMaxKey;

    }

    public static void main(String[] args) {
        
        int []arr = {1,2,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
       int maxFreqElement = getMaxFrequency(arr);
       System.out.println("Element with maximum frequency: " + maxFreqElement);
    }
}