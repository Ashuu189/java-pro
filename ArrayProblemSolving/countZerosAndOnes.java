package ArrayProblemSolving;

public class countZerosAndOnes {
    static int [] getZerosAndOnes(int arr[]){
        int countZeros=0;
        int countOnes=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i] & 1)==1){
                    countOnes++;
            }
            else countZeros++;

        }

        int newArray[]= {countZeros,countOnes};

        return newArray;
    }
    static void main(){
            int arr[]={0,0,0,1,1,0,1,0,1,1};

            int ans[]= getZerosAndOnes(arr);

            System.out.println("count of zeros is: "+ ans[0]);
            System.out.println("count of ones is: "+ ans[1]);
    }
}
