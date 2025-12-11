public class MinInRotatedSortedArr {
  
    static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element > high, min must be in right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
            // Else, min is in left half including mid
            else {
                high = mid;
            }
        }
        // low == high is the index of the minimum element
        return nums[low];
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7,  1, 2};
        System.out.println("Minimum element is: " + findMin(arr));
    }
}


