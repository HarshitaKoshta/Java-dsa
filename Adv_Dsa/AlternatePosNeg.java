class AlternatePosNeg{
    static void arrange(int[] a){
       int n = a.length;
        int i = -1;
        for (int j = 0; j < n; j++) {
            if (a[j] < 0) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int pos = i+1;
        int neg =0;
        while (neg < pos && pos < n && a[neg] < 0){
              int temp = a[neg];
            a[neg] = a[pos];
            a[pos] = temp;
            pos++;
            neg += 2;
        }
        for (int num : a) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,-2,4,-4,6,-3};
        arrange(a);
    }
}