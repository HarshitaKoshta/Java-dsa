public class setMat0 {
        public static void main(String[] args) {
        int[][] mat = {{13,3,9},{86,0,5},{53,0,3}};
        boolean[] row = new boolean[mat.length];
        boolean[] col = new boolean[mat[0].length];

        for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==0){
                row[i]=true;
                col[j]=true;
                }
            }
        }  
        
    for(int i = 0; i < mat.length; i++) {
        for(int j = 0; j < mat[0].length; j++) {
            if(row[i] || col[j]) {
            mat[i][j] = 0;
            }
        }
    }
    for(int[] r : mat) {
            for(int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
