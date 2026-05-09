import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find next greater for nums2
        for (int num : nums2) {

            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num);
            }

            st.push(num);
        }

        // Remaining elements have no greater element
        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}