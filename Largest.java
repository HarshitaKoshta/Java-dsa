public class Largest {
    public static void main(String[] args) {
        int[] arr = {3,5,32,2,1,4,42,12};
        int l = arr[0];
        for(int i = 1;i<arr.length;i++){
              if(arr[i]>l){
                l = arr[i];
              }
        }
        System.out.println("largest:"+l);
    }
}
