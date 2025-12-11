public class PaintersPartition {

    public static int minTime(int[] boards, int k) {
        int maxBoard = 0;
        int total = 0;

        for (int board : boards) {
            maxBoard = Math.max(maxBoard, board);
            total += board;
        }

        int low = maxBoard;
        int high = total;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canPaint(boards, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static boolean canPaint(int[] boards, int k, int maxTime) {
        int painters = 1;
        int currentSum = 0;

        for (int board : boards) {
            if (currentSum + board > maxTime) {
                painters++;
                currentSum = board;
                if (painters > k) {
                    return false;
                }
            } else {
                currentSum += board;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;
        System.out.println("Minimum time required: " + minTime(boards, k));
    }
}
