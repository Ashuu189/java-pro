package JavaBasics;
import java.util.Scanner;
public class basicMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n!=0){
        int mod= n % 10;
        System.out.println(mod);
        n= n/10;
        }
        sc.close();
             
    }
}
