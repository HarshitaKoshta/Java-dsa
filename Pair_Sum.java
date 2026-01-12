import java.util.*;

public class Pair_Sum {

    public static int countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int need = k - num;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int k = 6;

        System.out.println(countPairs(nums, k)); 
    }
}
