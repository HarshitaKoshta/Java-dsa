import java.util.HashMap;

public class LongestSubArr01 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 1, 0};

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            // 0 -> -1 , 1 -> +1
            if (arr[i] == 0)
                sum += -1;
            else
                sum += 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);  // pehli baar aaya sum
            }
        }

        System.out.println(maxLen);
    }
}

