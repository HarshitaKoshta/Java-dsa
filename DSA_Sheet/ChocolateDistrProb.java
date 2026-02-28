
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ChocolateDistrProb{

    static void distribution(ArrayList<Integer> a,int n ,int m){
        Collections.sort(a);
        int res = Integer.MAX_VALUE;
        

        for (int i = 0; i <= n-m; i++) {
            int minEle = a.get(i);
            int maxEle = a.get(i+m-1);
            res = Math.min(res,maxEle-minEle);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int m=5;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a.add(num);
        }
        distribution(a, n, m);
    }
}