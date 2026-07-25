class Solution {
    public int maxProduct(int n) {
    List<Integer> digits = new ArrayList<>();
    
    // digits nikalo (n%10, n/10)
    while (n > 0) {
        digits.add(n%10);  // last digit
        n = n/10 ;          // n chota karo
    }
    
    // sort karo descending
    digits.sort((a, b) -> b - a); 
    
    // top 2 multiply karo
    return digits.get(0) * digits.get(1);
}
}