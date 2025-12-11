public class firstOccrance {
    public static int strStr(String find, String give) {
        int a = give.length();
        if(a==0) return -1;

        for(int i=0;i<=find.length()-a;i++){
            if(find.substring(i,i+a).equals(give)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       System.out.println(strStr("Harshita", "rshi")); 
    }
}
