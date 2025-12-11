class alternate{
    public static void main(String[] args) {
        int[] arr = {4,3,-5,-3,9,9,-5};
        int n = arr.length;
        int[] res = new int[n];

        int pos = 0 ,neg = 1;

        for(int i:arr){
            if(i>0){
               res[pos]= i;
               pos= pos+2;
            }else{
                res[neg] = i;
                neg +=2;
            }
        }
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}