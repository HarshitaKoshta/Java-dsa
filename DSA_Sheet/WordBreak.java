import java.util.*;

public class WordBreak {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (brokenSet.contains(c)) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        System.out.println("Enter the broken letters:");
        String brokenLetters = sc.nextLine();

        WordBreak solution = new WordBreak();
        int result = solution.canBeTypedWords(text, brokenLetters);

        System.out.println("Number of words that can be typed: " + result);

        sc.close();
    }
}
