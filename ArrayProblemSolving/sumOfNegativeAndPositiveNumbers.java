package ArrayProblemSolving;

public class sumOfNegativeAndPositiveNumbers {
    static int[] getMaxSum(int arr[]){
        int posiSum=0;
        int negiSum=0;
    
        int [] newArray= new int [2];
        for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    posiSum += arr[i];
                }
                else{
                    negiSum+=arr[i];
                }
        }
        newArray[0]=posiSum;
        newArray[1]=negiSum;
        
        
        return newArray;

        
    }
    static void main(){

        int arr[]={-1,2,-3,4,-5,6};
        int [] result= getMaxSum(arr);
        for(int value: result){
            System.out.println("The positive sum and negative sum are these respectively: "+value+" ");
        }
       

    }
}
