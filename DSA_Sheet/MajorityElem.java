public class MajorityElem {
    public static int findMajority(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        // Phase 1: Find candidate
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Phase 2: Verify candidate
        int freq = 0;
        for (int num : nums) {
            if (num == candidate) freq++;
        }

        return (freq > nums.length / 2) ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 3, 4, 2, 3, 3, 5};
        System.out.println(findMajority(arr1)); // Output: 3

        int[] arr2 = {1, 2, 3, 4};
        System.out.println(findMajority(arr2)); // Output: -1
    }
}
