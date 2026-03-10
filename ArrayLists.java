
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);    
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1, 10);
        list.set(2,343);
        System.out.println(list);
        System.out.println(list.get(2)  );
        list.remove(2);
        System.out.println(list);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
