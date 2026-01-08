public class LeftRotateByK {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;

        k = k % n; 

        int[] temp = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // shift remaining elements to left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // put temp elements at end
        for(int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
