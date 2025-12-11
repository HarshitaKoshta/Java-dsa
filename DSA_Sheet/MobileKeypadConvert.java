public class MobileKeypadConvert {
    static String[] keypad = {
        "2", "22", "222",        // A, B, C
        "3", "33", "333",        // D, E, F
        "4", "44", "444",        // G, H, I
        "5", "55", "555",        // J, K, L
        "6", "66", "666",        // M, N, O
        "7", "77", "777", "7777",// P, Q, R, S
        "8", "88", "888",        // T, U, V
        "9", "99", "999", "9999" // W, X, Y, Z
    };

    public static void main(String[] args) {
        String input = "HELLO WORLD";
        System.out.println(convertToKeypad(input));
    }
    public static String convertToKeypad(String input) {
        input = input.toUpperCase(); // Normalize input
        StringBuilder result = new StringBuilder();
        char prevKey = ' '; // Tracks last key used

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                result.append("0");
                prevKey = '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A';
                String code = keypad[index];
                char currentKey = code.charAt(0);

                // Add space if previous key is same to denote pause
                if (currentKey == prevKey) {
                    result.append(" ");
                }

                result.append(code);
                prevKey = currentKey;
            }
        }
        return result.toString();
    }
}

