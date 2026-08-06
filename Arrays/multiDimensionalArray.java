package Arrays;
public class multiDimensionalArray {

  
public static void main(String[] args) {
    int [][] arr= {{1,2,3},
                   {4,5,6},
                   {7,8,9}};

    int n=arr.length;
    
    for(int row=0;row<n;row++){
        for(int col=n-1;col>=0;col--){
            System.out.print(arr[row][col]+" ");
        }
    }
    // System.out.print(arr[0][0]+" ");
    // System.out.print(arr[0][1]+" ");
    // System.out.print(arr[0][2]+" ");
    // System.out.print(arr[1][0]);
    // System.out.print(arr[1][1]);
    // System.out.print(arr[1][2]);
    // System.out.print(arr[2][0]);
    // System.out.print(arr[2][1]);
    // System.out.print(arr[2][2]);

    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[0].length;j++){

    //         System.out.print(arr[i][j]+" ");
    //     }
    // }


}
}
