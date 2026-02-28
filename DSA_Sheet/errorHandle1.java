
import java.util.Scanner;

class errorHandle1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();
       int b = sc.nextInt();

         try {
            int c = a/b;
        } catch (Exception z) {
            System.out.println("we can not divide by 0");
        }
    }
}