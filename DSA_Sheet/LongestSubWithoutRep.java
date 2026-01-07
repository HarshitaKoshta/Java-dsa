import java.util.HashSet;
import java.util.Set;

public class LongestSubWithoutRep {
       public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int l = 0, r= 0 ;
        int mlen = 0;
        while(r<n){
            char ch = s.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
                r++;
                mlen = Math.max(mlen, r - l);
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return mlen;
       }
       public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(str));
    }
}