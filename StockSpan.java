import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;

        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // pop while current price is higher
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }

            // if stack empty → span = i+1
            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());

            // push current index
            st.push(i);
        }

        // print span
        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}


// Tumhe ek array diya hai jo daily stock prices batata hai.
// Har day ke liye span nikaalo —
// 👉 matlab aaj ke price se peeche kitne consecutive days ka price ≤ aaj ke price hai.

// ✨ Example
// Input:
// prices = [100, 80, 60, 70, 60, 75, 85]

// Output:
// [1, 1, 1, 2, 1, 4, 6]


// Explanation (day 6 → price 85):

// 85 ≥ 75 ✅

// 85 ≥ 60 ✅

// 85 ≥ 70 ✅

// 85 ≥ 60 ✅

// 85 ≥ 80 ✅

// 85 < 100 ❌
// So span = 6