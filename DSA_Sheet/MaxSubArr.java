
public class MaxSubArr {
    public static void main(String[] args) {
        int[] arr = {1,3,-2,34,-55,4,-24,9,-2,89};
        int maxsum =0;
        int max=0;

        for(int i=0;i<arr.length;i++){
             if(maxsum+arr[i]>arr[i]){
                maxsum+=arr[i];
             }else
             maxsum=arr[i];
        }
        if(maxsum>max){
            max=maxsum;
        }
        System.out.println(max);
    }
}
