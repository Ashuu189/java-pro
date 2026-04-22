public class Patterns {
     static void main() {
        //outer loop controls the ro ws
        //inner loop controls the columns

        // ractangle pattern
        // int n=3 ;
        //  for(int row=1; row<=n; row++){
        //     for(int col=1; col<=5; col++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        //  }

        //right angle triangle pattern
        // int n=5;
        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=row; col++ ){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        //rhombus pattern
    //  int n=5;

    //  //traversing every row
    //  for(int row=1; row<=n;row++){
    //     //printing spaces
    //     for(int col=1; col<=n-row; col++ ){
    //         System.out.print("  ");
    //     }

    //     for(int col=1; col<=n; col++){
    //         System.out.print(" * ");
    //     }

    //     System.out.println();
    //  }

   //inverted right angled triangle
//    

//euilaterel triangle pattern

// int n=4;
// for(int row=1;row<=n;row++){
//     //part1 spaces
//     for(int col=1;col<=n-row;col++){
//         System.out.print("  ");
//     }
//     //part2 for stars
//     for(int col=1; col<=(2*row)-1; col++){
//         System.out.print("* ");
//     }


//     System.out.println();
// }
   
//hollow rectangle pattern
// int n=4;

// for(int row=1;row<=n; row++){
//     for(int col=1;col<=6;col++){

//         //col1 and col6 stars

//         if(row==1 || row==n){
//             System.out.print("* ");
//         }

//         else {
//             if(col==1 || col==6){
//                 System.out.print("* ");
//             }

//             else {
//                 System.out.print("  ");
//             }            
//     }
//      System.out.println();
// }
  
   //hollow right angled triangle pattern

//    int n=5; 
//    for(int row=1; row<=n; row++){
//     //part1
//     if(row==1 || row==2 || row==n){
//         for(int col=1; col<=row;col++){
//             System.out.print("* ");
//         }     
//     }
//     else{
//         System.out.print("* ");

//         for(int col=1; col<=(row-2);col++){
//             System.out.print("  ");
//         }
//         System.out.print("* ");
//     }
//     System.out.println();
//    }

//hollow equilateral triangle pattern
// int n=5;
// for(int row=1;row<=n;row++){
//     // part1: spaces
//     for(int col=1;col<=n-row;col++){
//         System.out.print("  ");
//     }

//     if(row==1|| row==5){
//         for(int col=1;col<=(2*row)-1;col++){
//             System.out.print("* ");
//   }     
//     }

//     else{
//         System.out.print("* ");

//         for(int col=1; col<=(2*row)-3;col++){
//             System.out.print("  ");
//         }
//         System.out.println("* ");
//     }

//     System.out.println();

// }

//Diamond pattern

// int n=4;
// for(int row=1;row<=n;row++){
//     //part1 spaces
//     for(int col=1;col<=n-row;col++){
//         System.out.print("  ");
//     }
//     //part2 for stars
//     for(int col=1; col<=(2*row)-1; col++){
//         System.out.print("* ");
//     }


//     System.out.println();
// }
// for(int row=1; row<=n;row++){
//     if(row==1){
//         continue;
//     }

//     for(int col=1;col<=row-1;col++){
//         System.out.print("  ");
//     }

//     for(int col=1; col<=2*n-2*row+1;col++){
//         System.out.print("* ");
//     }

//     System.out.println();
// }

//hollow diamond pattern
// int n=5;
// for(int row=1;row<=n;row++){
//     // part1: spaces
//     for(int col=1;col<=n-row;col++){
//         System.out.print("  ");
//     }

//     if(row==1){
//         for(int col=1;col<=(2*row)-1;col++){
//             System.out.print("* ");
//   }     
//     }

//     else{
//         System.out.print("* ");

//         for(int col=1; col<=(2*row)-3;col++){
//             System.out.print("  ");
//         }
//         System.out.println("* ");
//     }

//     System.out.println();

// }

//print 2 table
for(int row=1; row<=10;row++){
    for(int col=1; col<=2;col++){
        System.out.print(col*row + " ");
    }
    System.out.println();
}




}
}

 