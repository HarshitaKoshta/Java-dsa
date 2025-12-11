import java.util.Arrays;

public class ReverseArrRight {

    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;

        reverse(a, 0, n - 1);

        // Reverse first k elements
        reverse(a, 0, k - 1);

        //Reverse remaining elements
        reverse(a, k, n - 1);
    }

    public static void reverse(int[] a , int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {3,34,24,76,4,2,3,5};
        rotate(a, 3);
        System.out.println(Arrays.toString(a));
    }
}
