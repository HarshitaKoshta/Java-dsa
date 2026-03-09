package Arrays;

import java.util.Scanner;

class SumOfArr {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the array is: " + sum);

        if(sum%2==0){
            System.out.println("The sum is even");
        } else {
            System.out.println("The sum is odd");
        }   
    }
}