import java.util.*;

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
        System.out.println(list.contains(3));
 
        int s=list.get(0);
        int l = list.get(0);
        for(int num : list){
            if(num>l){
                l=num;
            }
            if(num<s){
                s=num;
            }
        }
        System.out.println(l);
        System.out.println(s);

        int sum=0;
        for(int num : list){
            sum+=num;
        }
        System.out.println(sum);

        int avg = sum/list.size();
        System.out.println(avg);

        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
        int count=0;
        for(int num : list){
            if(num%2==0){
                count++;
            }
        }
        System.out.println(count);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
