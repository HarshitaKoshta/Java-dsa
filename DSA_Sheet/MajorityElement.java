
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {5,5,6,9,5,5,6};

        HashMap<Integer,Integer> map = new HashMap<>();
        boolean found = false;

        for(int nums :arr){
           map.put(nums, map.getOrDefault(nums,0)+1);
            if (map.get(nums) > arr.length / 2) {
                System.out.println(nums);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No majority element present");
        }
    }
}
