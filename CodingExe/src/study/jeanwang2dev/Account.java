package study.jeanwang2dev;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;

    public Account(){
        this("110004", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    private String customerPhoneNumber;



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + balance);
    }

    public void withdraw(double amount){
        if( amount > balance ) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance = " + balance);
        }
    }
}
