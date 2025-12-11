public class StockBuySell {
     static void maxprofit(int[] p){
        int maxP = 0,bestBuy = p[0];

        for(int i=1;i<p.length;i++){
            if(p[i]>bestBuy){
                maxP = Math.max(maxP,p[i]-bestBuy);
            }
            bestBuy = Math.min(bestBuy,p[i]);
        }
        System.out.println(maxP);
     }

    public static void main(String[] args) {
        int[] p = {5,2,7,4,9,6};
        maxprofit(p);
    }
}
