package Arrays;

public class Alternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int[] ans = new int[n];

       int pos = 0;
       int neg = 1;

       for(int num:arr){
        if(num > 0){
            arr[pos] = n;
            pos += 2;
        } else {
            arr[neg] = n;
            neg += 2;
        }
       }
       for(int i:ans){
        System.out.print(i + " ");
       }
    }
}