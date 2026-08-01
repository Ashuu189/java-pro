package ArrayProblemSolving;

public class kadane {  
    
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        // Traversing the array
        for(int i=0;i<n;i++){
            // Updating Sum
            sum=sum+nums[i];
            // Storing maximum inside the maxi. 
            // if sum is greater then sum will stored in it else maxi value.
            maxi= Math.max(maxi,sum);
            // If sum is less than 0 then we will make sum=0.
            // Because if sum is less than 0 then it will not contribute to the maximum sum of subarray.
            if(sum<0){
                sum=0;
            }
        }
       return maxi;
    } 
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

