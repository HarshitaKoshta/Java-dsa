import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayToInteger {
    public static void addToArr(int[] num, int k) {
         int c=k;
        List<Integer> ans = new ArrayList<>();

        int p = num.length-1;
        int carry = 0;
        while(p>=0||k>0){
            int numVal = 0;
            if(p>=0){
                numVal = num[p];
            }

            int d = k%10;
            int sum = numVal + d + carry;
            
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);
            p--;
            k=k/10;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        System.out.println("After adding "+""+c+ " in num[], new array is :"+ans);
}
public static void main(String[] args) {
    int[] num = {1,2,9};
    int k = 56;
    addToArr(num,  k) ;
}
}