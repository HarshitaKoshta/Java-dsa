package Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {3,4,2,4,7};
        int pre[] = new int[arr.length];
        pre[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            pre[i] = arr[i] + pre[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(pre[i]);
        }
    }
}
