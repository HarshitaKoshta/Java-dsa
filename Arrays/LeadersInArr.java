public class LeadersInArr {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        System.out.println("Leaders in the array:");
      int maxA = arr[n-1];
      System.out.println(maxA);

      for(int i=n-2;i>=0;i--){
        if(arr[i]>maxA){
            maxA = arr[i];
            System.out.println(maxA+" ");
        }
      }
    }
}
