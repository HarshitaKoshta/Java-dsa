class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        
        if (n == 0) return 0;

        int ans = 0;

        for (int i = 1; i < n; i++) {
            ans += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }

        ans += duration;

        return ans;
    }
}