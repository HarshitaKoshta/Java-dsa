public class AverageSubArr {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;

        // Step 1: Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];  // add new, remove old
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: Return max average
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        
        System.out.println("Maximum Average Subarray: " + findMaxAverage(nums, k));
    }
}

