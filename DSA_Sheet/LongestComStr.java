public class LongestComStr {
    
    public static void main(String[] args) {
        String[] s ={"flow","flower","floor","flood"};
       String pre = s[0];

        for(int i=1;i<s.length;i++){
            while(!s[i].startsWith(pre)){
                pre = pre.substring(0,pre.length()-1);
            }
        }
        System.out.println("Longest Common Prefix: " + pre);
    }
}




