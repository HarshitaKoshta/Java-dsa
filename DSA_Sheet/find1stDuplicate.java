
import java.util.HashSet;

public class find1stDuplicate {
    public static void duplicate(int[] arr){
        HashSet<Integer> set =  new HashSet<>();
        int repeating = -1;

        for(int i = 0;i <arr.length;i++){
           if (set.contains(arr[i])) {
                repeating = arr[i];
                break;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(repeating);
        
    }
    public static void main(String[] args) {
        int[] arr = {3,1,3,5,6,7,6};
        duplicate(arr);
    }
}
