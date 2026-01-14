public class SecondLargest {

    static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE)
            return -1;

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};

        System.out.println(findSecondLargest(arr));
    }
}
