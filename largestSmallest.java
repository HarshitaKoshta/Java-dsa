public class largestSmallest {
    public static void main(String[] args) {
        int[] arr = {34, 12, 5, 67, 23, 89, 2};

        int lgt = arr[0];
        int smll = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lgt) {
                lgt = arr[i];
            }
            if (arr[i] < smll) {
                smll = arr[i];
            }
        }
        System.out.println("largest number is: " + lgt);
        System.out.println("smallest number is: " + smll);
    }
}
