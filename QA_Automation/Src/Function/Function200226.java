package Src.Function;

public class Function200226 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        int[][] result = buildMatrix(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static int[][] buildMatrix(int[] arr) {

            int n = arr.length;
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {        // տող
                for (int j = 0; j < n; j++) {    // սյուն
                    matrix[i][j] = arr[j] + i;
                }
            }

            return matrix;
        }


}
