
public class revArr {
    public static void main(String[] args) {
        int[] arr = {21,3,3,4,56,4};
        int st = 0;
        int end  =arr.length-1;

        while(st<end){
            int temp = arr[st];
            arr[st]=arr[end];
            arr[end]=temp;

            st++;
            end--;
        }
        for(int num :arr){
            System.out.println(num);
        }
    }
}
