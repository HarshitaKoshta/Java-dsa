public class PairSumInSortedRotated {
    public static void main(String[] args) {
        int[] arr = {1,3,33,56,66,87,4,8};
        int target = 60;
        int n = arr.length;
        int pivot  =-1;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                pivot = (i+1)%n;
                break;
            }
        }
        int left = pivot;
        int right = (pivot - 1 + n) % n;
 
        while(left!=right){
            int sum = arr[left] + arr[right];

            if (sum == target){
               System.out.println("pair sum present");
               return;
            }
            else if (sum < target)
                left = (left + 1) % n;
            else
                right = (right - 1 + n) % n;
        }
        System.out.println("not present");
    }
}
