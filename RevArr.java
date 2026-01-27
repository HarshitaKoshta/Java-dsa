public class RevArr {
    public static void main(String[] args) {
        int[] arr = {3,4,3,0,4,5,76};
        int n = arr.length;


        for(int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
