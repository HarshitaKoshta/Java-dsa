import java.util.*;

public class PalindromeReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;

        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;

            if (s[i] == '?' && s[j] == '?') {
                s[i] = s[j] = 'a';
            } 
            else if (s[i] == '?') {
                s[i] = s[j];
            } 
            else if (s[j] == '?') {
                s[j] = s[i];
            } 
            else if (s[i] != s[j]) {
                System.out.println(-1);
                return;
            }
        }

        if (n % 2 == 1 && s[n/2] == '?') {
            s[n/2] = 'a';
        }

        System.out.println(new String(s));
    }
} 
