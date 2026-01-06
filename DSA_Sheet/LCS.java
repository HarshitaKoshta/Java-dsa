public class LCS {

    public static void main(String[] args) {
        String[] s = {"flow", "flower", "floor", "flood"};
        if (s == null || s.length == 0) {
            System.out.println("Longest Common Prefix: ");
            return;
        }

        String pre = s[0]; // start with first word

        for (int i = 1; i < s.length; i++) {
            while (!s[i].startsWith(pre)) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) { // no prefix left
                    System.out.println("Longest Common Prefix: ");
                    return;
                }
            }
        }
        System.out.println("Longest Common Prefix: " + pre);
    }
}


