import java.util.HashMap;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,5};
        
      HashMap<Integer,Integer> map = new HashMap<>();

       for (int num : nums) {
            if (map.containsKey(num)) {
                System.out.println("duplicate present");
               return;
            }
            map.put(num, 1);
        }
        System.out.println("no duplicate");
    }

}
