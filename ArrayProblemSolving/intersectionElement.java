package ArrayProblemSolving;

public class intersectionElement {
    
    static int[] intersect(int []arr1,int []arr2){
        int [] newArray= new int[arr1.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
             if(arr1[i]==arr2[j]){
               newArray[k]=arr1[i];
               k++;
               break;
             }
            }
        }

        return newArray;

    }

    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={6,7,2,3,8,9};

        int [] ans= intersect(arr1, arr2);

        for(int value: ans){
            if(value!=0){
            System.out.println(value);
            }
            
        }



    }
}


// [1,2,3,4,5]
//[6,7,2,3,8,9]

//[2,3]
