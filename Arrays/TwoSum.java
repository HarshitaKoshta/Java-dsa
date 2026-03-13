package Arrays;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,7,23,9,5,6};
        int tar = 16;
         HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {

            int c = tar - arr[i];

            if(map.containsKey(c)) {
                System.out.println(map.get(c) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No two elements sum up to the target.");
    }
}
