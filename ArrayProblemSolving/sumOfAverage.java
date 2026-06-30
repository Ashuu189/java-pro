package ArrayProblemSolving;

public class sumOfAverage {

    public static double getSumOfAverage(int [] arr){
       int count=0;
       int size=arr.length;
       for(int value:arr){
        count+=value;
       } 
       
       double result= (double) count/size;

       System.out.println(result);
       
       return result;
    }
    public static void main(String[] args) {
        int [] arr={2,4,1,3};

        getSumOfAverage(arr);
    }
}
