public class SearchIn2dMat {

    public static boolean binarySearchRow(int[] row, int target) {
        int left = 0, right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == target)
                return true;
            else if 
                (row[mid] < target) left = mid + 1;
            else 
                right = mid - 1;
        }

        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;       
        int n = matrix[0].length;    

        int top = 0, bottom = m - 1;
        int row = -1;

        
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][n - 1]) {
                row = mid;
                break;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }

        if (row == -1) return false;

        return binarySearchRow(matrix[row], target);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        System.out.println(searchMatrix(matrix, 3));   
        System.out.println(searchMatrix(matrix, 13));  
        System.out.println(searchMatrix(matrix, 30));  
        System.out.println(searchMatrix(matrix, 60));  
    }
}
