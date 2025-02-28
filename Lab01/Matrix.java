import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, cols;
        int[][] matrix1, matrix2, sumMatrix;
         
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();

        matrix1 = new int[rows][cols];
        matrix2 = new int[rows][cols];
        sumMatrix = new int[rows][cols];

        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	System.out.println("Enter the elements at row "+ (i + 1) + ", col " + (j + 1) +":");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	System.out.println("Enter the elements at row "+ (i + 1) + ", col " + (j + 1) +":");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Sum of Matrix 1 and Matrix 2" + ":");
        for (int[] row : sumMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
