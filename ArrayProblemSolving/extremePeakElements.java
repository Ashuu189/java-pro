package ArrayProblemSolving;

public class extremePeakElements {
    static int[] findExtreme(int[] arr) {
        // Implementation for finding extreme peak elements
        int left = 0;
        int right = arr.length - 1;
        int k = 0;
        int [] newArray= new int[arr.length];
        while (left <= right) {
        newArray[k++] = arr[left++];
        newArray[k++] = arr[right--];
}
            return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int[] result = findExtreme(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

// {1,2,3,4,5,6}
// {1,6,2,5,3,4}
