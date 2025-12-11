import java.util.HashSet;

public class Repeat_MissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 5, 6}; 
        int n = arr.length;

        int sum = 0;
        int expectedSum = n * (n + 1) / 2;
        int repeating = -1;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            sum += num;
            if (set.contains(num)) {
                repeating = num;
            } else {
                set.add(num);
            }
        }

        int missing = expectedSum - (sum - repeating);

        System.out.println("Repeating Number: " + repeating);
        System.out.println("Missing Number: " + missing);
    }
}
