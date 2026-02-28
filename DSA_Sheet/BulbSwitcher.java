
import java.util.Scanner;

public class BulbSwitcher {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of bulb:");
       int n = sc.nextInt();
        int count = 0;
        int i=1;
        while(i*i<=n){
            count++;
            i++;
        }
        System.out.println("The number of bulbs that are on after "+n+" rounds are: "+count);
    }
}
