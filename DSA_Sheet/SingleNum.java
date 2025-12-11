public class SingleNum {
    public static void main(String[] args) {
        int[] arr = {3,3,0,4,4,2,2};
        int result = 0;

        for(int num :arr){
            result ^=num;
        }
        System.out.println(result);
    }
}
