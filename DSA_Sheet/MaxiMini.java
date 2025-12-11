public class MaxiMini {
    public static void main(String[] args) {
        int[] arr ={2,4,6,1,7,73,60};
        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
