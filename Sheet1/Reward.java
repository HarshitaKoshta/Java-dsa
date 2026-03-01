
import java.util.Scanner;

public class Reward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        // medals
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int totalCups = a1 + a2 + a3;
        int totalMedal = b1 + b2 + b3;

        if (totalCups > totalMedal) {
            System.out.println("Cups");
        } else if (totalMedal > totalCups) {
            System.out.println("Medals");
        } else {
            System.out.println("Equal");
        }


    }
}
