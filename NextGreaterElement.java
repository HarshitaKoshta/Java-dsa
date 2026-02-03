import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;

        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        // traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // remove smaller or equal elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // top of stack is next greater
            nge[i] = st.isEmpty() ? -1 : st.peek();

            // push current element
            st.push(arr[i]);
        }

        // print result
        for (int x : nge) {
            System.out.print(x + " ");
        }
    }
}
