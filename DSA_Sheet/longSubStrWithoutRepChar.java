import java.util.HashMap;
import java.util.Map;

public class longSubStrWithoutRepChar {

    public static int longestStr(String s){
         Map<Character, Integer> map = new HashMap<>();
         int lt = 0, maxLen =0;

         for(int rt =0 ; rt<s.length(); rt++){
            char ch = s.charAt(rt);
            if(map.containsKey(ch) && map.get(ch)>=lt){
                lt = map.get(ch) + 1;
            }
            map.put(ch, rt);
            maxLen =  Math.max(maxLen, rt - lt + 1);
         }
         return maxLen;
    }
    public static void main(String[] args) {
        String s ="aabcdebcdec";
        System.out.println(longestStr(s));
    }
}
