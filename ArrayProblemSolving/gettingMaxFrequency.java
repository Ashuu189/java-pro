package ArrayProblemSolving;

import java.util.HashMap;

public class gettingMaxFrequency {
    static int getFreq(int arr[]){

        HashMap<Integer,Integer> CountFreq= new HashMap<>();
      
        for(int value: arr){
                CountFreq.put(value, CountFreq.getOrDefault(value, 0)+1);
        }

        // for(int key :CountFreq.keySet()){
        //     System.out.println(key + ": " + CountFreq.get(key));
        // }

        int maxFreq=-1;
        int maxFreqKey=-1;

        for(int key: CountFreq.keySet()){
            int currentKey=key;
            int currentKeyFreq=CountFreq.get(key);

            if(currentKeyFreq>maxFreq){
                maxFreq=currentKeyFreq;
                maxFreqKey=currentKey;
            }

        }

        return maxFreqKey;


        }

        public static void main(String[] args) {
            int arr[]={1,2,2,3,4,5,5,5,5,5,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
            int ans=getFreq(arr);
            System.out.println(ans);
             
        }
}
