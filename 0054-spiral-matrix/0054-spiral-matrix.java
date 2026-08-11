import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int startingRow = 0;
        int endingRow = matrix.length - 1;

        int startingCol = 0;
        int endingCol = matrix[0].length - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            // 1. Row-wise: left -> right
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // 2. Column-wise: top -> bottom
            // Check if any column is remaining
            if (startingCol <= endingCol) {
                for (int row = startingRow; row <= endingRow; row++) {
                    result.add(matrix[row][endingCol]);
                }
                endingCol--;
            }

            // 3. Row-wise: right -> left
            // Check if any row is remaining
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // 4. Column-wise: bottom -> top
            // Check if any column is remaining
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }

        return result;
    }
}