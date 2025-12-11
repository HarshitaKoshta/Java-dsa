public class KadanesAlgo {
    public static void main(String[] args) {
        int[] a = {3,-2,5,-4,5,1,8,-3,9};
        int currSum = 0 , maxSum = -100;

        for(int val :a){
            currSum +=val;
            maxSum = Math.max(currSum,maxSum);

            if(currSum<0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
