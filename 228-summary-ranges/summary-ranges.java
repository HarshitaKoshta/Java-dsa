import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            
            // jab tak consecutive hai
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            
            // range add karo
            if (start == nums[i]) {
                list.add(start + "");
            } else {
                list.add(start + "->" + nums[i]);
            }
        }
        
        return list;
    }
}