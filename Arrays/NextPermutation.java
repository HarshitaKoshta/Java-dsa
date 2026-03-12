package Arrays;

import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // step 1: find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // step 2: if no pivot, reverse whole array
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // step 3: find next greater element from right
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // step 4: reverse suffix
        reverse(nums, pivot + 1, n - 1);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2};

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}