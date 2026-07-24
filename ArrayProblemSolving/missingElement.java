package ArrayProblemSolving;

public class missingElement {
//    public static int getMissingElement(int arr[], int range){
//    int sumOfArray=0;
//    int sumOfRange=0;

//    for(int i=0;i<=range;i++){
//     sumOfRange+=i;
//    }

//    for(int j=0;j<arr.length;j++){
//     sumOfArray+=arr[j];
//    }

//    int ans=sumOfRange-sumOfArray;
//     return ans;
//    }

//    public static void main(String[] args) {
//     int arr[]={1,2,4,5};
//     int range=5;

//     System.out.println(getMissingElement(arr, range));
//    }

public static int getMissing(int nums[]){

    int n=nums.length;
    int xorSum=0;
    for(int num:nums){
        xorSum=xorSum^num;
    }

    for(int i=0;i<=n;i++){
        xorSum=xorSum^i;
    }

    return xorSum;
}

public static void main(String[] args) {
    int [] nums={0,1,2,4,5};
    int ans=getMissing(nums);
    System.out.println(ans);
}


}
