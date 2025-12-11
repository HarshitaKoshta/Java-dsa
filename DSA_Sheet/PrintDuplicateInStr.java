import java.util.HashMap;

public class PrintDuplicateInStr {
    public static void main(String[] args) {
        String s = "harshita";
         HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
         
        for (char ch : freqMap.keySet()) {
            if (freqMap.get(ch) > 1) {
                System.out.println(ch + ": " + freqMap.get(ch));
            }
        }
    }
}
