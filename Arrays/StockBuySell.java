package Arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,6,3};
        int minp = Integer.MAX_VALUE;
        int maxp = 0;

        for(int i : arr){
            if(i < minp){
                minp = i;
            } 
            else if(i - minp > maxp){
                maxp = i - minp;
            }
        }

        System.out.println(maxp);
    }
}
