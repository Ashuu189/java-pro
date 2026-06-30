package ArrayProblemSolving;

public class maxNumInArray {
   public static int findMax(int arr[]){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    
    //after traversing through the array if it don't get any value that is greater than max that means arr[0] is the maximum element.
    return max;

   }

    public static void main(String[] args) {
        int arr[]={11,10,3,4,5,9};

        System.out.println(findMax(arr));


    }
}
