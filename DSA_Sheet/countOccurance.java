class countOccurance{
    static void countOcc(int[] a){
   
     for (int i = 0; i < a.length; i++) {
          int count = 0;
         for (int j = 0; j < a.length; j++) {
             if(a[i]==a[j]){
                count++;
             }
            
         }
          System.out.println(a[i]+":"+count);
     }
    }
    public static void main(String[] args) {
        int[] a ={1,2,1,3,4,2,5,3,2};
        countOcc(a);
    }
}