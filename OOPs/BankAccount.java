package OOPs;

public class BankAccount {
    private String accHolder;
    private int bal;

    public BankAccount(String name, int bal) {
        this.accHolder = name;
        this.bal = bal;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int amount) {
        if (amount < 0) {
            System.out.println("❌ Balance cannot be negative");
        } else {
            this.bal = amount;
            System.out.println("Balance updated Successfully...");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(int amount) {
        if (amount > bal) {
            System.out.println("Insufficient balance");
        } else {
            bal -= amount;
            System.out.println("Withdraw successful: " + amount);
        }
    }
    
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
