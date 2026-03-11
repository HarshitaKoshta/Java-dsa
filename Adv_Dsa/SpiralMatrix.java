public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,4},{2,3,5},{3,5,6}};

        int n = mat.length;
        int m = mat[0].length;

        int top = 0;
        int left = 0;
        int bottom =n-1;
        int right = m-1;

        while(top<=bottom && left<=right){
            for(int i = left; i <= right; i++){
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for(int i = top; i <= bottom; i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;
             if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
             if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
        
    }
}
