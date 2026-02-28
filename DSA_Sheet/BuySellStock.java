class BuySellStock{
    static void bestTime(int[] a){
        int bestPrice = a[0];
        int bestSell = 0;
        for(int i =1;i<a.length;i++){
              if(a[i]>bestPrice){
                bestSell = Math.max(bestSell,a[i]-bestPrice);
              }
              bestPrice = Math.min(bestPrice,a[i]);
        }
        System.out.println("best buy:"+bestPrice+"\n"+"maximum profit:"+bestSell);
    }
    public static void main(String[] args) {
        int[] a = {4,2,6,8,3};
        bestTime(a);
    }
}