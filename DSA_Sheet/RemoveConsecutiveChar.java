public class RemoveConsecutiveChar {
    public static void main(String[] args) {
        String s = "aaabbbnnncc";
        String newS = "";

        newS += s.charAt(0); 

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                newS += s.charAt(i);
            }
        }

        System.out.println(newS); 
    }
}

