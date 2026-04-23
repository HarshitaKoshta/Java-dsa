class Solution {
    public int maxSubArray(int[] nums) {
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
        return summax;
    }
}