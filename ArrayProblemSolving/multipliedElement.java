package ArrayProblemSolving;

public class multipliedElement {
   //wap to multiply each element of array by 20 and print the new array 

   public static int [] getNewArray(int arr[]){
    int size=arr.length;
    int [] newArray= new int[size];
    for(int i=0;i<arr.length;i++){
        int element=arr[i];
        int newElement=element*10;
        newArray[i]=newElement;
    }

    return newArray;
   }
      
   public static void main(String[] args) {
    int arr []= {1,2,3,4,5};

    int ans []= getNewArray(arr);
   for(int value:ans){
    System.out.print(value+" ");
   }
   }
}
