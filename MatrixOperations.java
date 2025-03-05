import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        // Example usage
        int rows = 3;
        int cols = 3;
        
        double[][] matrixA = createRandomMatrix(rows, cols);
        double[][] matrixB = createRandomMatrix(rows, cols);
        
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        
        System.out.println("Addition:");
        displayMatrix(addMatrices(matrixA, matrixB));
        
        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));
        
        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
        
        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(matrixA));
        
        System.out.println("Determinant of A:");
        System.out.println(determinant(matrixA));
        
        // Uncomment to find inverses when applicable
        // System.out.println("Inverse of A:");
        // displayMatrix(inverseMatrix(matrixA));
    }

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextDouble() * 10; // Random numbers between 0 and 10
            }
        }
        return matrix;
    }

    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static double determinant(double[][] matrix) {
        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        if (matrix.length == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                   matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                   matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        throw new UnsupportedOperationException("Determinant not implemented for matrices larger than 3x3");
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f ", value);
            }
            System.out.println();
        }
    }
}