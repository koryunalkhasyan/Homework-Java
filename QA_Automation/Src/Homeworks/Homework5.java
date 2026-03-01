package Src.Homeworks;

public class Homework5 {

        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int m = matrix.length;
            int n = matrix[0].length;

            System.out.println("Իտերացիա ըստ սյուների (վերևից ներքև):");

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            }
        }

