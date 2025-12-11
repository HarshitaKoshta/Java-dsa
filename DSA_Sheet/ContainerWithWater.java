
class ContainerWithWater{
    public static void main(String[] args) {
        int[] h = {1,3,4,2,7,9,5};
        int n = h.length;
        int mostWater = 0;

        int lf = 0, rt = n-1;

        while(lf<rt){
            int w = rt - lf;

            int ht = Math.min(h[lf],h[rt]) ;
            int area = w*ht;

            mostWater =  Math.max(mostWater, area);

             if (h[lf] < h[rt]) {
             lf++;
            } else {
             rt--;
            }
        }
        System.out.println(mostWater);
    }
}    
