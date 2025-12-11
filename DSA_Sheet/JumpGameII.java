
public class JumpGameII {
    public static int jump(int[] nums) {
        int jumps = 0;
        int farthest = 0;
        int currentEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest index we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we reached the end of the current range, take a jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {

        int nums[] = {2,4,4,2,5,2,1,3};
        System.out.println(jump(nums));

    }
}