import java.util.*;

public class PoweOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();   
        while (n > 1) {
            if (n % 2 != 0) {
                System.out.println("NO");
                return;
            }
            n = n / 2;
        }

        System.out.println("YES");
    }
}

