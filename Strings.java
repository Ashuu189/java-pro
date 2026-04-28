import java.util.Scanner;

public class Strings {
    //This uses string literal and it is stored in string pool

    //finding the length of the string
    // static void printString(String str){
    //     int n=str.length();
    //     for(int i=0;i<=n;i++){
    //         char ch= str.charAt(i);
    //         System.out.println(ch);
    //     }
    // }

    //getting length of the string using loop and functions
// static int getLengthOfString(String str){
//     int count=0;
//     for(int i=0; i<str.length();i++ ){
//         count++;
//     }
//     return count;
// }

//reversing the string
// static String getReversedString(String str){
//     String reverse="";
// for(int i=str.length()-1;i>=0;i--){
//     char value= str.charAt(i);
//     reverse=reverse+value;
// }

// return reverse;
// }

//checking palindrome or not
static String getReversedString(String str){
    String reverse="";
for(int i=str.length()-1;i>=0;i--){
    char value= str.charAt(i);
    reverse=reverse+value;
}
if(reverse.equals(str)){
    return "Palindrome";
}
else{
    return "not palindrome";
}

}
   static void main(){

    String str="nnoonn";
    // printString(str);
    System.out.println(getReversedString(str));
    //This uses new keyword and it is stored in heap memory
//      String firstName=new String("Ashutosh");

//      //This uses string literal and it is stored in string pool
    //  String lastName="Sarkar";

     //Accessing elements using index 
    //  System.out.println(lastName.charAt(4));

//      //printing the string
//       System.out.println(firstName+" "+lastName);

// //taking the input string from user
// Scanner sc=new Scanner(System.in);

// System.out.print("Enter your string:"+" ");

// String str=sc.nextLine();

// System.out.println("Your String is:"+" "+str);

// //traversing the string using for loop
// for(int i=0;i<firstName.length();i++){
//    char result= firstName.charAt(i);
//    System.out.print(result);
// }
   
// Scanner sc=new Scanner(System.in);
 
// System.out.println("Enter your string:"+" ");
// //this will take the entire string as input not just one word
// String str=sc.nextLine();

// System.out.println("Enter String 2:");
// //This will only take the first word as input
// String str2=sc.next();

// System.out.println(str);
// System.out.println(str2);

//String pre-defined methods

//to check if the string is empty or not
//empty considers spaces
// String str="Ashutsh Sarkar";
// System.out.println(str.isEmpty());

//to check if the string is blank or not

// String str="   ";
//blank does not consider spaces
// System.out.println(str.isBlank());

//triming the string 
// String str="  Ashutosh Sarkar  ";
// System.out.println(str.length());

// str=str.trim();
// System.out.println(str.length());

//to convert the string to lower case
// String str="HELLO";
// System.out.println(str.toLowerCase());

//to convert the string to upper case
// String str="hello";
// System.out.println(str.toUpperCase());

// String str= new String("Ashutosh");

// making a string to character array
// char [] nameArray= str.toCharArray();

//iterating the character array using for each loop
// for(char value:nameArray){
// System.out.println("The value of character is: "+value);

// }

//replace is used to replace a character with another character
// str=str.replace("A","z");
// System.out.println(str);



}
}
        
    

