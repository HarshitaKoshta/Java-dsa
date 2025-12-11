public class ReverseWords {
    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "hello world from ChatGPT";
        String output = reverseWords(input);
        System.out.println(output);
    }
}
