class car{
    String brand;
    int price;

    void start(){
        System.out.println("Car starting......");
    }
}

public class Practice{
    public static void main(String[] args) {
        car c = new car();
        c.brand = "fortuner";
        c.price = 300000;
        System.out.println(c.brand);
        c.start();
    }
}