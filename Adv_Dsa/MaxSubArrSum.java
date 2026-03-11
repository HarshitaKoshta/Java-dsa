class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = {3, -3, 6, 2, -1, 2, 6, -3};
        int maxS = arr[0];
        int sum = arr[0];  

        for(int i = 1; i < arr.length; i++) {
            maxS = Math.max(arr[i], arr[i] + maxS);

            sum = Math.max(sum, maxS);
        }
        System.out.println("Maximum Subarray Sum: " + sum);
    }
}