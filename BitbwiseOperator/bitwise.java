package BitbwiseOperator;
import java.util.*;
public class bitwise {
    public static void main(String[] args) {
//    int n=10;
//    int i=0;
//    int answer=0;
//     while(n!=0){
//         int bit= n&1;
//         answer= (int)(Math.pow(10,i)*bit)+answer;
//         n=n>>1;
//         i++;
      
//     }
    // System.out.println(answer);

    //  if((n&1)==0){
    //     System.out.println("its even number");
    // }
    // else{
    //     System.out.println("Its odd number");
    // }

    // int n=0;
    
    //brute force to find out the number is power of 2 or not
    // int count=0;

    // while(n!=0){
    //     if((n&1)==1){
    //        count++;
    //     }
    //      n=n>>1;
     
    // }

    // System.out.println(count);

    //   if(count>1){
    //     System.out.println("Its not power of 2");
    //   }  

    //   else if(count==0){
    //     System.out.println("Its not power of 2");
    //   }
      
    //   else{
    //     System.out.println("Its power of 2");
    //   }

    //shortcut to find out the number is power of 2 or not

    //when we check non power of 2 number with the previous number it return 1. So its not power of 2. 
    //But when we check power of 2 number with the previous number it return 0. So its power of 2.

    // int n=5;

    // if((n&(n-1))==0){
        
    //     System.out.println("Its power of 2");
    // }
    // else{
    //     System.out.println("Its not power of 2");
    // }

    //swapping two number using xor
    // int a=5;
    // int b=6;
    // a=a^b;
    // b=a^b;
    // a=a^b;

    // System.out.println("a= "+a);
    // System.out.println("b= "+b);

    //find the unique number in the series
    //where all other numbers are present twice
    // int a= 10^24^13^10^24^17^17;

    // System.out.println(a);
    // }

    int n=10;
   int answer=0;
    int i=0;
    while(n!=0){
        int bit= n&1;
        answer= (int)(Math.pow(10,i))*bit+answer;
        n=n>>1;
        i++;
    }

    System.out.println(answer);



    }

    
    
}
