public class BankAccount {
    // Properties
    String accountNumber;
    String ownerName;
    double balance;

    // Constructor for initial value when object being called
    // The scope is on the called object
    // Ex:
    // this.accountNumber is for object's value, while accountNumber is parameter that acquired when object is called
    // BankAccount("1000")
    // this.accountNumber still empty string and accountNumber is "1000"
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Callable method, can be called by objectName.displayInfo();
    // Nothing specials
    void displayInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    // Callable method, can be called by objectName.displayInfo();
    // Add amount (method's parameter) to this.balance (object's attribute)
    // Then print
    void depositMoney(double amount){
        this.balance += amount;
        System.out.printf("%s Deposited Rp %.2f. Current Balance: Rp %.2f%n", ownerName, amount, balance);
    }

    // Validate this.balance if this.balance is lower than amount, throw an error then print the error.
    // If conditions meet, update this.balance value to this.balance - amount
    // Then print
    void withdrawMoney(double amount){
        if  (this.balance < amount){
            System.out.printf("%s Withdraw Rp %.2f. (Failed, insufficient balance), Current Balance: Rp %.2f%n", ownerName, amount, balance);
            return;
        }

        this.balance -= amount;
        System.out.printf("%s Withdraw Rp %.2f. (Success), Current Balance: Rp %.2f%n", ownerName, amount, balance);
    }
}
