public class LinearSearch {
    public static void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        int target = 1;
        linearSearch(arr, target);
    }
}
