class CheckSortRotated {
    static void RotatedSort(int[] a){
       int count = 0;

       for(int i = 0; i< a.length; i++){
        if(a[i]>(a[(i+1)%a.length])){
            count++;
        }
       }
       if(count==1){
        System.out.println("sorted and rotated");
       }else
       System.out.println("not sorted");
    }
    public static void main(String[] args) {
          int[] a = {3, 4, 5, 1, 2};
        RotatedSort(a);
    }
}