package ArrayProblemSolving;
import java.util.*;
public class findingMissingFromTheArrayOfDuplicates {
    public static List<Integer> findDuplicates(int []nums){
        int n=nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index<n;index++ ){
            //marking

            int value=Math.abs(nums[index]);
            int position=value-1;

            if(nums[position]>0){
                nums[position]=-nums[position];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        List<Integer> ans=findDuplicates(nums);
        for(int i:ans){
          System.out.println(i);
        }
    }
}

