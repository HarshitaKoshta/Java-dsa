class Solution {
   public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    int m = grid.length, n = grid[0].length;
    int total = m * n;
    int[][] result = new int[m][n];
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            // Step 1: current 1D position
            int oldPos = i * n + j;
            
            // Step 2: new 1D position
            int newPos = (oldPos + k) % total;
            
            // Step 3: new 2D position
            int newRow = newPos / n;
            int newCol = newPos % n;
            
            result[newRow][newCol] = grid[i][j];
        }
    }
    
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < m; i++) {
        List<Integer> row = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            row.add(result[i][j]);
        }
        ans.add(row);
    }
    return ans;
}
}