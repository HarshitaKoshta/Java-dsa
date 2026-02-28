
import java.util.HashSet;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr ={1,2,8,4,3,5,7,2,3,7};
        HashSet<Integer> set = new HashSet<>();
        for(int i :arr){
            if(!set.add(i)){
               System.out.println(i);
            }
        }
    }
}
