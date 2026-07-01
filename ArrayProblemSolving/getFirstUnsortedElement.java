package ArrayProblemSolving;

public class getFirstUnsortedElement {
    static int getUnsorted(int []arr){
        int element=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                element=arr[i]; 
                break;      
            }
        }
        return element;
    }
   static void main(){
    
        int arr[]={1,2,3,5,4,6,7,8,9,10};
        int ans= getUnsorted(arr);
        if(ans==0){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The first unsorted element is: "+ans);
        }
   }
}

