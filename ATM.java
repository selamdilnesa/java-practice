
public class ATM {

    private String accountHolder;
    private int accountNumber;
    private int pin;
    private double balance;

    // Constructor
    public ATM(String accountHolder, int accountNumber, int pin, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Current balance: " + balance);
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    // Change PIN
    public void changePin(int oldPin, int newPin) {
        if (oldPin == pin) {
            this.pin = newPin;
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Your old PIN does not match!");
        }
    }
    public static void main(String[] args){
        ATM atm = new ATM("Selam", 12345, 1234, 5000);
        atm.deposit(1000);
        atm.withdraw(2000);
        atm.checkBalance();
        atm.changePin(1234, 5678);
    }
}
