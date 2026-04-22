public class Methods {
static void print2table(){
    for(int i=1;i<=10;i++){
        System.out.println(2*i);
    }
}

 int addTwoNumbers(int a, int y){
    int sum=a+y;
   return sum;
}

  public static void main() {
    // System.out.println("start of the program");   
    // print2table();
    Methods m= new Methods();

    System.out.println(m.addTwoNumbers(10, 0));
     System.out.println("End of the program");
System.out.println();
    //    int result = addTwoNumbers(10,20);
    //    System.out.println("The sum of the two numbers is: " + result);
    }
} 