class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                i += 2; // 2-bit character
            } else {
                i += 1; // 1-bit character
            }
        }
        
        return i == bits.length - 1;
    }
}