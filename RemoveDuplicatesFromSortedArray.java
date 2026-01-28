import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        System.out.println("Array without duplicates:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

                                                                    