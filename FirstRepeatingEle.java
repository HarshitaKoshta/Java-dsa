import java.util.*;

class FirstRepeatingEle{

    public static int firstRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find first element with frequency > 1
        for (int num : arr) {
            if (map.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeating(arr));
    }
}
