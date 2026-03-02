package Arrays;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,5,6};

        
 int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length) {

            // Skip duplicates in array a
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in array b
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }

        // Remaining elements of a
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                result.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                result.add(b[j]);
            }
            j++;
        }

        System.out.println(result);
}
}