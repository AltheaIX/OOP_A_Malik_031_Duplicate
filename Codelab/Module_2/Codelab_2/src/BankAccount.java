public class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void displayInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    void depositMoney(double amount){
        balance += amount;
        System.out.printf("%s Deposited Rp %.2f. Current Balance: Rp %.2f%n", ownerName, amount, balance);
    }

    void withdrawMoney(double amount){
        if  (balance < amount){
            System.out.printf("%s Withdraw Rp %.2f. (Failed, insufficient balance), Current Balance: Rp %.2f%n", ownerName, amount, balance);
            return;
        }

        balance -= amount;
        System.out.printf("%s Withdraw Rp %.2f. (Success), Current Balance: Rp %.2f%n", ownerName, amount, balance);
    }
}
