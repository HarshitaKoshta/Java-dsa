class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;

        for (int j = n - 1; j > 0; j--) {
            if (colors[0] != colors[j]) {
                maxDist = Math.max(maxDist, j);  
                break; 
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, (n - 1) - i);
                break; 
            }
        }

        return maxDist;
    }
}