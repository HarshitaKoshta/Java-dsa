package Arrays;

import java.util.HashSet;

public class LongestSubStrWithoutRep {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set = new HashSet<>();
    
    int left = 0, maxLength = 0;

    for(int right = 0; right < s.length(); right++) {
        while(set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        }
        
        set.add(s.charAt(right));
        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
}
    public static void main(String[] args) {
    LongestSubStrWithoutRep obj = new LongestSubStrWithoutRep();
    
    String s = "abcabcbb";
    int result = obj.lengthOfLongestSubstring(s);
    
    System.out.println("Longest substring length: " + result);
    }
}
