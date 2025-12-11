
import java.util.HashMap;

public class Missing_Repeat {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,6};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num :arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        int miss = -1 ,rep = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i)) {
                miss = i;
            } else if (map.get(i) == 2) {
                rep = i;
            }
        }
        System.out.println("Repeating: " + rep);
        System.out.println("Missing: " + miss);
    }
}
