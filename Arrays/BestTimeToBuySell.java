package Arrays;

public class BestTimeToBuySell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        System.out.println("Maximum profit: " + maxProfit);
    }
}
