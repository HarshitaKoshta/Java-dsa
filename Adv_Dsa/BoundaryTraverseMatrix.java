public class BoundaryTraverseMatrix {
    static void boundaryTraversal(int[][] matrix, int m, int n) {
        System.out.println("Boundary traversal of the matrix is:");
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[0][i] + " ");
            }
        }
        else if (n == 1) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][0] + " ");
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[0][i] + " ");
            }
            for (int i = 1; i < m; i++) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            for (int i = n - 2; i >= 0; i--) {
                System.out.print(matrix[m - 1][i] + " ");
            }
            for (int i = m - 2; i >= 1; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},  {5, 6, 7, 8},{9, 1, 1, 2},{3 ,1, 5, 6}};
        int m = matrix.length;
        int n = matrix[0].length;
        boundaryTraversal(matrix, m, n);
    }
}