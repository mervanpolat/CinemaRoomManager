import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading matrix dimensions n (rows) and m (columns)
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Initializing the matrix
        int[][] matrix = new int[n][m];

        // Reading matrix elements
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        // Reading column indices i and j to swap
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        // Swapping the columns
        for (int row = 0; row < n; row++) {
            // Swap elements of column i and j in the current row
            int temp = matrix[row][i];
            matrix[row][i] = matrix[row][j];
            matrix[row][j] = temp;
        }

        // Printing the modified matrix
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
