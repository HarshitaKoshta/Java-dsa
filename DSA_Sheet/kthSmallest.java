
import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr  = {23,5,24,74,8,0};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k:");
        int k = sc.nextInt();

        int kthSmallest = arr[k-1];
        System.out.println(k+" smallest is: "+kthSmallest);
    }
}
