public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,32,22,36,34,92,23,12,28};

        for(int i=0;i<arr.length;i++){
            int minI = i;
            for(int j =0; j<arr.length;j++){
                if(arr[j]<arr[minI]){
                    minI = j;
                }
            int temp = arr[i];
            arr[i] = arr[minI];     
            arr[minI] = temp;
            }

           
        }
         for(int x: arr){
                System.out.print(x+" ");
            }
    }
}
