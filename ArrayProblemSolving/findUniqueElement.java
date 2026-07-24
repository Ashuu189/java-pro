package ArrayProblemSolving;

public class findUniqueElement {
    public static int findUnique(int nums[]){
        int xorSum=0;
        for(int num:nums){
            xorSum=xorSum^num;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[]= {1,3,4,5,1,2,3,4,5};
        System.out.println(findUnique(arr));
        
    }
}
