import java.util.*;


public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        // If no rows requested, return empty result
        if (numRows == 0) return res;

        // Add first row [1]
        res.add(new ArrayList<>());
        res.get(0).add(1);

        // Build from 2nd row to numRows
        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                // sum of 2 above element 
                int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                curr.add(val);
            }

            curr.add(1); // Last element is 1
            res.add(curr);
        }

        return res;
    }

    public static void main(String[] args) {
        PascalsTriangle p = new PascalsTriangle();
        List<List<Integer>> triangle = p.generate(5);

        // Print the triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}


