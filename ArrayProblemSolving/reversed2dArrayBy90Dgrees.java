package ArrayProblemSolving;

public class reversed2dArrayBy90Dgrees {
    public static void rotate(int[][] matrix) {
       int n=matrix.length;
        //transpose the matrix
        for(int row=0;row<n;row++){
            for(int col=row+1;col<n;col++){
                // After choosing the triangle, swap the values of remaining indices to get the transpose in the same array.
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
        //reversing the element by traversing each rows
        for(int row=0;row<n;row++){
            int startCol=0;
            int endCol=n-1;

            // Two pointer technique to swap elements
            while(startCol<=endCol){
                int temp=matrix[row][startCol];
                matrix[row][startCol]=matrix[row][endCol];
                matrix[row][endCol]=temp;

                startCol++;
                endCol--;
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
       System.out.println("Original Matrix:");
       for(int row=0;row<arr.length;row++){
           for(int col=0;col<arr[0].length;col++){
               System.out.print(arr[row][col]+" ");
           }
           System.out.println();
       }
       rotate(arr);
       System.out.println("Matrix after 90-degree clockwise rotation:");
       for(int row=0;row<arr.length;row++){
           for(int col=0;col<arr[0].length;col++){
               System.out.print(arr[row][col]+" ");
           }
           System.out.println();
       }
    }
}
