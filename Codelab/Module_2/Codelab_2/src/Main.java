public class Main {
    public static void main(String[] args) {
        // Create new object
        BankAccount bankAccount1 = new BankAccount("202410370110031", "Malik Zaky Zahroni", 50000);
        BankAccount bankAccount2 = new BankAccount("202410370110032", "Test Test Test", 110000);

        // Call call-able method (non-static) from object
        bankAccount1.displayInfo();
        bankAccount2.displayInfo();

        // Call call-able method with parameter (non-static) from object
        bankAccount1.depositMoney(200000);
        bankAccount2.depositMoney(50000);

        System.out.println();

        // Call call-able method with parameter (non-static) from object
        bankAccount1.withdrawMoney(100000);
        bankAccount2.withdrawMoney(300000);

        System.out.println();

        // Call call-able method (non-static) from object
        bankAccount1.displayInfo();
        bankAccount2.displayInfo();

    }
}