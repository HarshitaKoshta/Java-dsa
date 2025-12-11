public class BubbleSort {

    public static void bubble(int[] a,int n){
       for (int i = 0; i < a.length; i++) {
           for(int j =0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] =temp;
            }
           }
       }
    }
    public static void main(String[] args) {
        int n =5;
        int[] a = {2,52,64,8,28};
        bubble(a, n);  

        for (int x : a) {
            System.out.print(x + " ");
        }

    }
}
