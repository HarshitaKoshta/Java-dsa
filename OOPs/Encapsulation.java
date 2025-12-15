package OOPs;

public class Encapsulation {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Pihu", 50000);

        System.out.println("Account Holder: " + acc.getAccHolder());
        System.out.println("Current Balance: " + acc.getBal());

        acc.deposit(1000);
        acc.withdraw(2000);

        acc.setBal(-500);
        acc.setBal(8000);
    }
}
