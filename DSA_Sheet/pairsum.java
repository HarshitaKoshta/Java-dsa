
public class pairsum {

    public static boolean pairSum(int[] arr,int tar){
       int l =0 ,r = arr.length-1;
       int sum = 0;
       while(l<r){
          sum = arr[l] + arr[r];
          if(sum==tar){
            return true;
          }else if(sum>tar){
             r--;
          }else{
            l++;
          }
       }
       return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,14,29};
        int tar = 12;
      System.out.println(pairSum(arr, tar));
    }
}
