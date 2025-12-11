public class LongestSubArraySum {

    public static int longestSubarray(int[] nums, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];  

            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int k = 7;
        System.out.println(longestSubarray(nums, k)); 
    }
}
