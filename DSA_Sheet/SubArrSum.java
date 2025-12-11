public class SubArrSum {
    public static int sumLessThanK(int[] arr, int k) {
        int sum = 0, msum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }
            msum = Math.max(msum, sum);
        }
        return msum;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 4, 0, 5, 2, 1};
        int k = 7;
        System.out.println(sumLessThanK(a, k)); // Output: 7
    }
}



    // wsum=0

    // for(let i =0;i<k;i++){
    //     wsum += arr[i]
    // }
    // for(let i =k;i<n;i++){
    //     wsum = wsum + arr[i] - arr[i-k];
    //     if(wsum>maxSum){
    //         maxSum = wsum;
    //     }
    // }
    // console.log(maxSum);
    