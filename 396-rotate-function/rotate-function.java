class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long F = 0;

        // Calculate sum and F(0)
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += (long)i * nums[i];
        }

        long maxVal = F;

        // Use relation to compute next values
        for (int k = 1; k < n; k++) {
            F = F + sum - (long)n * nums[n - k];
            maxVal = Math.max(maxVal, F);
        }

        return (int) maxVal;
    }
}