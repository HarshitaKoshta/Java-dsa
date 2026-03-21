package Arrays;

public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,4,3};

        int l = 0, r = arr.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;

            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;   
            } else {
                r = mid;       
            }
        }

        System.out.println(arr[l]); 
        System.out.println("Index: " + l);
    }
}