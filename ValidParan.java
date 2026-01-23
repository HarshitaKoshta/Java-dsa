import java.util.*;

public class ValidParan {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParan obj = new ValidParan();

        String s1 = "()[]{}";
        String s2 = "(]";

        System.out.println(s1 + " -> " + obj.isValid(s1)); // true
        System.out.println(s2 + " -> " + obj.isValid(s2)); // false
    }
}
