class CyclicRotateArrByOne{
   static void rotate(int[] a){
     int last = a[a.length-1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
     System.out.print("after rotation array :");
     for(int num:a){
     System.out.println(num);
    }
   }    
    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        rotate(a);
    }
}