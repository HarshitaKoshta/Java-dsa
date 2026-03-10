public class PascalTriangle {
    public static void main(String[] args) {
        int n = 7;
        int[][] tri = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    tri[i][j] = 1;
                }
                else{
                    tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
                }
                System.out.print(tri[i][j] + " ");
            }
            System.out.println();
        }
    }
}