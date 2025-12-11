public class MaxProductSubArr {
    public static void main(String[] args) {
        int[] arr = {2,4,8,-4,9,10};
        int maxP=1;
        for (int i = 0; i <arr.length; i++) {
         int max =1;
             for(int j =i;j<arr.length;j++){
               max *= arr[j];
               if(max>maxP){
                maxP = max;
               }
            }
       }
       System.out.println("maximum sub array product is "+maxP);
    
    }
}
