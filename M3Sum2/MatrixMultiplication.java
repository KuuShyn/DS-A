
// import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = enterMatrix("A");
        int B[][] = enterMatrix("B");
        multiplyMatrix(A, B);

    }

    public static int[][] enterMatrix(String chr) {
        Scanner input = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.printf("\nEnter number of rows of Matrix %s: ", chr);

            try {
                row = input.nextInt();
                if (row < 1)
                    System.out.println("Error, Negative numbers and zero are not allowed");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Error, You cannot input letters it has to be numbers");
                input.next();
            }
        }

        while (true) {
            System.out.printf("\nEnter number of columns of Matrix %s: ", chr);

            try {
                col = input.nextInt();
                if (col < 1)
                    System.out.println("Error, Negative numbers and zero are not allowed");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Error, You cannot input letters it has to be numbers");
                input.next();

            }
        }

        System.out.printf("\nEnter Elements of Matrix %s:\n", chr);
        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        displayMatrix(matrix, chr);

        if (!input.hasNextLine())
            input.close();

        return matrix;

    }

    public static void multiplyMatrix(int A[][], int B[][]) {
        if (A[0].length == B.length) {
            int product[][] = new int[A.length][B[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < B.length; k++)
                        product[i][j] += A[i][k] * B[k][j];
                }
            }

            displayMatrix(product, "A*B");

        } else {
            System.out.println(
                    "Matrices can only be multiplied if the number of columns in the first matrix is equal to the number of rows in the second matrix."
                            + " The matrices cannot be multiplied.");
            displayMatrix(A, "A");
            displayMatrix(B, "B");
        }
    }

    public static void displayMatrix(int matrix[][], String chr) {
        System.out.printf("\nMatrix of %s:\n", chr);
        // for (int[] element : matrix)
        // System.out.println(Arrays.toString(element));

        // ===================================

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) 
                    System.out.print(", ");
                
            }
            System.out.println("]");
        }

    }
}