public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
       for(int i=0;i<arr.length;i++){
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];     
            arr[j-1] = temp;
            j--;
        }
       }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
