public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,32,22,36,34,92,23,12,28};

        for(int i=0;i<arr.length;i++){
            for(int j =0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];     
                    arr[j+1] = temp;
                }
            }
        }
         for(int x: arr){
                System.out.print(x+" ");
            }   
    }
}
