package ArrayProblemSolving;

public class shiftElementByOne {
    static void shiftOne(int arr[]){
        int n=arr.length;
        int i=n-1;
        int temp=arr[i];

        for(i=n-1;i>0;i--){
            //shifting one by one
            arr[i]= arr[i-1];  
        }

        //putting the last element to first using temp
            arr[0]=temp;

        for(int value:arr){
            System.out.print(value+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        shiftOne(arr);
    }
}

