class ErrorHandle{
    public static void main(String[] args) {
        int a = 4,b=0;
        try {
            int c = a/b;
        } catch (Exception z) {
            System.out.println("we can not divide by 0");
        }
        System.out.println("helooo");
    }
}