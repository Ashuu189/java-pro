package ArrayProblemSolving;
import java.util.HashMap;
public class getMaxMinFrequency {
    
    static int [] getMaxMinFrequency(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int lowestFreqNumber = -1;

        for(int key: map.keySet()){
            int currentKey= map.get(key);
            if(currentKey > highestFreq){
                highestFreq = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        for(int key: map.keySet()){
            int currentKey= map.get(key);
            if(currentKey < lowestFreq){
                lowestFreq = currentKey;
                lowestFreqNumber = key;
            }    
        }

        int []result = {highestFreq, lowestFreqNumber};
        return result;
 
    }

    public static void main(String[] args) {
        
        int []arr = {1,2,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        int []result = getMaxMinFrequency(arr);
        System.out.println("Highest Frequency: " + result[0]);
        System.out.println("Lowest Frequency Number: " + result[1]);
    }
}
