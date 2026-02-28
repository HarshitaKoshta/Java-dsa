import java.util.*;

public class PerfectSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
