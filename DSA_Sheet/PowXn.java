public class PowXn {
    public static void main(String[] args) {
        int n = -3;
        double x = 4;
        long bin = n;
      
        if(n<0){
            x = 1/x;
            bin = -bin;
        }
        double ans = 1;
        while(bin > 0){
            if(bin % 2 == 1){
                ans *= x;
            }
            x *= x;
            bin /=2;
        }
        System.out.println(ans);
    }
}
