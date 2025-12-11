import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) return res;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; 

                int left = j + 1;
                int right = n - 1;
                long sum = (long)target - (long)nums[i] - (long)nums[j];

                while (left < right) {
                    long twoSum = (long)nums[left] + (long)nums[right];
                    if (twoSum == sum) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        int currentLeft = nums[left];
                        int currentRight = nums[right];
                        while (left < right && nums[left] == currentLeft) left++;
                        while (left < right && nums[right] == currentRight) right--;
                    } else if (twoSum < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
