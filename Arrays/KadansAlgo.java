package Arrays;
    
public class KadansAlgo{
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = nums[0];
        int summax = nums[0];
        int n = nums.length;

        for(int i =1;i<n;i++){
           if(max + nums[i] > nums[i]){
            max = max+nums[i];
           }else{
           max =nums[i];
           }
           if(max>summax){
            summax=max;
           }
        }
        System.out.println(summax);
    }
}