public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "racecar";
        boolean palin  =true;
        int st = s.charAt(0);
        int ed = s.charAt(s.length()-1 );
          for(int i=0;i<s.length();i++){
             if(st!=ed){
                palin = false;
                break;
             }
          }
          if(palin)
        System.out.println("palindrome");
    else
        System.out.println("not palindrome");
    }
}
