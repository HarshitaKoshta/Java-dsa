class Solution {
    public long sumAndMultiply(int n) {

        int rev = 0;
        // Reverse the number
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        long num = 0;
        long sum = 0;

        // Process digits in original order
        while (rev > 0) {
            int digit = rev % 10;

            if (digit != 0) {
                num = num * 10 + digit;
                sum += digit;
            }

            rev /= 10;
        }

        return num * sum;
    }
}