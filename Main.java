abstract class Payment {
    private String transactionId;
    private double amount;

    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;

        if (amount > 0) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    abstract void processPayment();

    void displayTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: " + amount);
    }
}


// CREDIT CARD CLASS

class CreditCard extends Payment {

    private String cardHolder;
    private String cardNumber;

    CreditCard(String transactionId, double amount,
               String cardHolder, String cardNumber) {

        super(transactionId, amount);

        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Credit card payment was processed");
    }
}


// PAYPAL CLASS

class PayPal extends Payment {

    private String email;

    PayPal(String transactionId, double amount, String email) {

        super(transactionId, amount);

        this.email = email;
    }

    @Override
    void processPayment() {
        System.out.println("PayPal payment was processed");
    }
}


// BANK TRANSFER CLASS

class BankTransfer extends Payment {

    private String bankName;
    private String accountNumber;

    BankTransfer(String transactionId, double amount,
                 String bankName, String accountNumber) {

        super(transactionId, amount);

        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Bank transfer was processed");
    }
}


// MAIN CLASS

public class Main {

    public static void main(String[] args) {

        CreditCard c1 = new CreditCard(
            "TXN001", 2500.0, "SELAM", "CD001"
        );

        PayPal p1 = new PayPal(
            "TXN002", 1500.0, "selam@gmail.com"
        );

        BankTransfer b1 = new BankTransfer(
            "TXN003", 5000.0, "CBE", "1000ER"
        );


        // PAYMENT ARRAY (POLYMORPHISM)

        Payment[] payments = {c1, p1, b1};


        // PROCESS ALL PAYMENTS

        for (Payment payment : payments) {

            System.out.println("\n--------------------");

            payment.processPayment();

            payment.displayTransaction();
        }
    }
}