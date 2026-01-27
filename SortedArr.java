public class SortedArr {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,1};
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
           if(arr[i] < arr[i + 1]) {
               continue;
           } else {
               System.out.println("Array is not sorted");
               return;
           }  
        }
        System.out.println("Array is sorted");
    }
}
