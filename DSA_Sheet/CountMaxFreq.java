import java.util.*;

public class CountMaxFreq {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0;
        for (int f : freq.values()) {
            maxFreq = Math.max(maxFreq, f);
        }
        
        // count elements with that frequency
        int total = 0;
        for (int f : freq.values()) {
            if (f == maxFreq) {
                total += f;
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums)); 
    }
}
