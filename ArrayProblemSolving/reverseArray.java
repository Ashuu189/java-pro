package ArrayProblemSolving;

public class reverseArray {
    static void reverse(int arr[]){
        int n=arr.length;
        int temp=0;
        int i=0;
        int j= n-1;

        //swapping condition
        while(i<=j){

            //swapping format
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            //i moves to right side
            i++;

            //j moves to left side 
            j--;


        }

        for(int value:arr){
            System.out.print(value+ " ");
        }
    }

   static void main() {
        int [] arr= {1,2,3,4,5};

        reverse(arr);
       
    }
    
}
