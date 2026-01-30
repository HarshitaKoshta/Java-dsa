public class CountNum {
    public static void main(String[] args) {
        int[] arr = {2,3,2,2,4,3,5,5,2,1};
        boolean[] visited = new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                int count = 1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i]+" occurs "+count+" times");
            }
        }
    }
}
