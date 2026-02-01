public class MissingNumXor {

    static int missingNumber(int[] arr, int n) {
        int xorAll = 0;
        int xorArr = 0;

        // XOR of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR of array elements
        for (int i = 0; i < arr.length; i++) {
            xorArr ^= arr[i];
        }

        return xorAll ^ xorArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        System.out.println("Missing number: " + missingNumber(arr, n));
    }
}
