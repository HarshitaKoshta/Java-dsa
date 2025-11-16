import java.util.*;

class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter r / p / s: ");
        String user = sc.next();

        String[] choices = {"r", "p", "s"};
        String comp = choices[rand.nextInt(3)];

        System.out.println("Computer chose: " + comp);

        if(user.equals(comp)) {
            System.out.println("Draw!");
        }
        else if(
            (user.equals("r") && comp.equals("s")) ||
            (user.equals("p") && comp.equals("r")) ||
            (user.equals("s") && comp.equals("p"))
        ) {
            System.out.println("User wins!");
        }
        else {
            System.out.println("Computer wins!");
        }
    }
}
