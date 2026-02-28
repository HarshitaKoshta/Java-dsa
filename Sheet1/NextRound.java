import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of participants
        int k = sc.nextInt();   // k-th position

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // scores
        }
        int count = 0;
        int kthScore = arr[k-1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= kthScore && arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

