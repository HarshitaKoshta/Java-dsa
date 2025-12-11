public class BookAllocation {

    public static boolean isPossible(int[] arr, int m, int maxPages) {
        int students = 1;
        int currentSum = 0;

        for (int pages : arr) {
            if (pages > maxPages) {
                return false; 
            }
            if (currentSum + pages > maxPages) {
                students++;
                currentSum = pages;
                if (students > m) {
                    return false;
                }
            } else {
                currentSum += pages;
            }
        }
        return true;
    }

    public static int allocateBooks(int[] arr, int m) {
        int low = 0;
        int high = 0;
        
        for (int pages : arr) {
            high += pages;
            low = Math.max(low, pages);
        }

        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, m, mid)) {
                result = mid;
                high = mid - 1; // try to minimize further
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int m = 2;
        System.out.println("Minimum max pages = " + allocateBooks(arr, m));
    }
}
