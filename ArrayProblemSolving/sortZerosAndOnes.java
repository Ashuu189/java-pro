package ArrayProblemSolving;

// [100010101]->[000001111]
public class sortZerosAndOnes {
   public static int[] sortZeros(int []arr){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        //cond1: 
        if(arr[i]==1 && arr[j]==0){
            //swap
            arr[i]=0;
            arr[j]=1;
        }
        if(arr[i]==0 ){
            i++;
        }
        if( arr[j]==1){ 
            j--;
        }

    }
    return arr;
}

public static void main(String[] args) {
    int arr[]={1,0,0,0,1,0,1,0,1};
    int []ans=sortZeros(arr);

   for(int value:ans){
    System.out.print(value);
   }
}
}
