import java.util.*;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) return false; // cycle found
            seen.add(n);

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return true; // reached 1
    }

    public static void main(String[] args) {
        int num = 19;
        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number!");
        } else {
            System.out.println(num + " is NOT a Happy Number!");
        }
    }
}
