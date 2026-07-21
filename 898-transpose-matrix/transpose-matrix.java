class Solution {
   public int[][] transpose(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    
    int[][] result = new int[n][m];
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            result[j][i] = grid[i][j];
        }
    }
    return result;
}
}