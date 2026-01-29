public class RotateKpos {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        int n = arr.length;
        int[] temp = new int[n];

        k = k % n;  

        // last k elements to front
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // print
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
