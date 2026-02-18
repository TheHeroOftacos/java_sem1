package project2;
public class uzd4 {
    public static void main(String[] args) {
        int N = 3; // size of matrix
        double[][] matrix = generateMatrix(N);

        // Print matrix
        System.out.println("Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Print dot products
        System.out.println("\nDot products:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.println("Row " + i + " · Column " + j + " = " + getProduct(matrix, i, j));
        }
    }

    static double[][] generateMatrix(int N) {
        double[][] matrix = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = Math.round(Math.random() * 10.0 * 100.0) / 100.0;
        return matrix;
    }

    static double getProduct(double[][] matrix, int i, int j) {
        double product = 0;
        int N = matrix.length;
        for (int k = 0; k < N; k++)
            product += matrix[i][k] * matrix[k][j];
        return product;
    }
}
