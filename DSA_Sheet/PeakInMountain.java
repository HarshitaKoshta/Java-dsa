
public class PeakInMountain {
    public static void peak(int[] a){
        int left = 0;
        int right = a.length-1;

        while(left<right){
            int mid = (left+right)/2;
            if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]){
                System.out.println("peak element is: "+a[mid]);
                break;
            }else if(a[mid+1]>a[mid]){
                left = mid+1;
            }else{
                right = mid;
            }
               
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,6,8,9,4,3,2,1};
        peak(a);
    }
}
