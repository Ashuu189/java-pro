package ArrayProblemSolving;

//idea is to use two pointer approach, one pointer will point to the last unique element and the other pointer will traverse the array.
//  If the current element is not equal to the last unique element, we will increment the unique pointer and update the value at that position.

public class removeDulicatesFromSortedArray {
    public static int removeDuplicates(int [] nums){
        int i=0;
        int j=1;
        int n=nums.length;

        while(j<n){
            //agar duplicate milta hai to
            if(nums[i]==nums[j]){
                j++;
            }
            //agar value nahi match to
            else{
                i++;
                nums[i]=nums[j];
                j++;
            }
          
        }
        return i+1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,2,2,2,3,3,4};
        int ans= removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + ans);
    }
}
