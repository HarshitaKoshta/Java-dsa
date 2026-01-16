import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] freq = new int[11]; // index 0 unused

        for (int x : A) {
            freq[x]++;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(freq[i]);
        }
        sc.close();
    }
}
