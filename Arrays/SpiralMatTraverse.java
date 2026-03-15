package Arrays;

public class SpiralMatTraverse{
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {1,4,5},
            {6,7,8}
        };

        int n = mat.length;
        int m = mat[0].length;

        int top = 0, left =0, bottom=n-1, right = m-1;

        while(top<=left && bottom<=right){
            for(int i = left; i <= right; i++){
                System.out.print(mat[top][i] + " ");
            }
            top++;
            
        }

    }
}