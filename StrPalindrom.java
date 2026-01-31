public class StrPalindrom {
    public static void main(String[] args) {
        String s = "madam";

        char[] a = s.toCharArray();

        int start = 0;
        int end = a.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (a[start] != a[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
