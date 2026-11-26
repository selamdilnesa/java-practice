public class BankAcc {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private int pin;
    BankAcc(String accountHolder,String accountNumber,double balance,int pin){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        if(balance >=0){
            this.balance=balance;
        }else{
           throw new IllegalArgumentException("Invalid balance");
        }
       if (pin>=1000 && pin<=9999){
        this.pin=pin;
       }else{
        System.out.println("the pin must be 4 digit");
       }
    }
    public String getAccountHolder(){
        return accountHolder;
    }
     public String getAccountNumber(){
        return accountNumber;
    }
    void setAccountHolder(String accountHolder){
        if(accountHolder!=""){
            this.accountHolder=accountHolder;
        }
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("invalid input");
        }
    }
    void withdraw(double amount,int enteredPin){
        if(enteredPin==pin){
            if(amount>0 &&amount<=balance){
                balance-=amount;
                System.out.println("withdraw is done succesfully");
            }else{
                System.out.println("invalid input");
            }

        }else{
            System.out.println("incorrect password");
        }
    }
    void changePin(int oldPin,int newPin){
        if(oldPin==pin){
            if (newPin>=1000 && newPin<=9999){
                if (newPin!=oldPin){
                    pin=newPin;
                }else{
                    System.out.println(" new pin must not be same with old pin");
                }
               
            }else{
                System.out.println("put 4 digit pin  ");
            }
        }else{
            System.out.println("incorrect pin");
        }
    }
    void displayAccountInfo(){
        System.out.println("name :"+accountHolder);
        System.out.println("account number :" +accountNumber);
        System.out.println("balance : " + balance);
    }
    public static void main(String[] args) {
        BankAcc A1=new BankAcc("selam", "AAU2026001", 5000, 1234);
        A1.deposit(1500);
        A1.withdraw(2000, 1234);
        A1.withdraw(10000, 1234);
        A1.changePin(1234, 5678);
        A1.displayAccountInfo();
    }
}
