class ArrUnion{
     static void union(int[] a,int[] b){
          for (int i = 0; i < a.length; i++) {
             {
                System.out.println(a[i]);
             }              
          }
          for (int j = 0; j < b.length; j++) {
            boolean found = true;
            for (int i = 0; i < a.length; i++) {
                if(b[j]==a[i]){
                   found = false;
                   break;
                }
            }
             if(found){
            System.out.println(b[j]);
          }
          }
         
     }      

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b ={3,4,5,6};
        union(a,b);
    }
}