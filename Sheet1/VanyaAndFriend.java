import java.util.Scanner;

public class VanyaAndFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int h = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > h) {
                count += 2; // needs to bend down
            } else {
                count += 1; // can walk straight
            }
        }   
        System.out.println(count);
    }
}
