import java.util.*;

public class OneFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Step 1: Frequency array
        int[] freq = new int[100001]; // because Ai ≤ 10^5

        for (int x : A) {
            freq[x]++;
        }

        // Step 2: Find first element with frequency 1
        int answer = -1;
        for (int x : A) {
            if (freq[x] == 1) {
                answer = x;
                break;
            }
        }

        // Step 3: Print result
        System.out.println(answer);

        sc.close();
    }
}

}
