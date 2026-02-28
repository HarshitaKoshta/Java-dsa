class ContainerMostWater {
    static void maxArea(int[] height) {
        int maxWater = 0;
        int lp =0 , rp = height.length-1;

        while(lp<rp){
            int w = rp-lp;
            int ht = Math.min(height[lp],height[rp]);
            int currWater = w*ht;
            maxWater = Math.max(maxWater,currWater);
            
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
     System.out.println("most water in container:"+maxWater);
    }
    public static void main(String[] args) {
        int[] height = {2,5,7,2,9,3};
        maxArea(height);
    }
}