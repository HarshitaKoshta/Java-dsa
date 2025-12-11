import java.util.Arrays;

class kthLarge{
    public static void main(String[] args) {
        int[] arr = {2,4,24,6,5,78};
        int kth = 2;
        
        Arrays.sort(arr);
        // for(int n:arr){
        // System.out.println(n);
        // }
        
        int kLarge = arr[arr.length-kth];
        System.out.println(kth+" largest is "+kLarge);
    }
}