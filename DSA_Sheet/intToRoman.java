class intToRoman{  

    public static String IntToRoman(int num){
  
        int[] values = {1000, 900, 500, 400, 100, 90,  50, 40, 10, 9,  5, 4, 1};
        String[] romans = {"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        // Iterate and keep subtracting while building Roman numeral
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romans[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(IntToRoman(1206));
    }
}    

