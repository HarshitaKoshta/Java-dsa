public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[] numbers = {-3, 1, 1, 4, 4, 4, 9, 12};
        int target = 13;
        twoSum(numbers, target);
    }
}


