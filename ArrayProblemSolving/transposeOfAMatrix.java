package ArrayProblemSolving;

public class transposeOfAMatrix {
     public static int[][] transpose(int[][] matrix) {
        int rowLen=matrix.length;
        int colLen=matrix[0].length;
        int ans[][]=new int [colLen][rowLen];

        if(matrix==null || matrix.length==0){
            return new int[0][0];
        }
        for(int row=0; row<rowLen; row++){
            for(int col=0; col<colLen; col++){
                ans[col][row]=matrix[row][col];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int ans[][]= transpose(matrix);

        for(int i=0;i<ans.length;i++){
            for( int j=0;j<ans[0].length;j++){
                
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();

        }

    }
}
