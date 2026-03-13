package Arrays;
import java.util.*;

public class LeadersInArr {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxA = arr[n-1];
        leaders.add(maxA);

        for(int i = n-2; i >= 0; i--){
            if(arr[i] > maxA){
                maxA = arr[i];
                leaders.add(maxA);
            }
        }

        Collections.reverse(leaders);

        System.out.println(leaders);
    }
}
