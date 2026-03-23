package Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {

            // skip duplicates
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } 
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } 
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        return (third == null) ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};

        Solution obj = new Solution();
        System.out.println(obj.thirdMax(nums));
    }
}