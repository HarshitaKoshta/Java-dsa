import java.util.*;

public class SortVow{
    public static void main(String[] args) {
        String s = "pihu";
        System.out.println(sortVowels(s));
    }

    public static String sortVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        char[] arr = s.toCharArray();

        int lt = 0;
        int rt = arr.length - 1;

        while(lt < rt) {
            
            while(lt < rt && !vowels.contains(arr[lt])) {
                lt++;
            }
            
            while(lt < rt && !vowels.contains(arr[rt])) {
                rt--;
            }
            if(lt < rt) {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;

                // Move both pointers inward
                lt++;
                rt--;
            }
        }
        return new String(arr);
    }
}