public class Merge2SortedArr {
    public static void main(String[] args) {
        int[] A = {8,9,10,0,0,0};
        int[] B = {5,6,7};
        int m= 3,n = B.length;

        int idx = m+n-1 , i = m-1, j= n-1;

        while(i>=0 && j>=0){
            if(A[i]>=B[j]){
                A[idx--] = A[i--];
            }else{
                A[idx--] = B[j--];
            }
        }
        while(j>=0){
            A[idx--] = B[j--];
        }
         for (int num : A) {
            System.out.print(num + " ");
        }
    }  
}
