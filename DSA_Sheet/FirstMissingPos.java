import java.util.*;

public class FirstMissingPos {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 1;
        while (set.contains(ans)) {
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr1)); // Output: 2

        int[] arr2 = {1,2,0};
        System.out.println(firstMissingPositive(arr2)); // Output: 3

        int[] arr3 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr3)); // Output: 1
    }
}
