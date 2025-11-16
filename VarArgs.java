public class VarArgs {
    static int sum(int ...arr){
        int res = 0;
        for(int a:arr){
            res += a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,7));
        System.out.println(sum(3,5,3,5,7));
    }
}
