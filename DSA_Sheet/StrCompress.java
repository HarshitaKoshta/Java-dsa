public class StrCompress {
    public static void Compression(String a ){
        int i = 0;
        while(i<a.length()){
           char c = a.charAt(i);
           int count = 1;
           while(i+1<a.length()&& c == a.charAt(i+1)){
                count++;
                  i++;
           }
        System.out.print(c+""+count);
            i++;
        }
    }

    public static void main(String[] args) {
        String a = "aaabcccdd";
        Compression(a);
    }
}
