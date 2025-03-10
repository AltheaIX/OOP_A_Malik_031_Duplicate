public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("202410370110031", "Malik Zaky Zahroni", 50000);
        BankAccount bankAccount2 = new BankAccount("202410370110032", "Test Test Test", 110000);
        bankAccount1.displayInfo();
        bankAccount2.displayInfo();

        bankAccount1.depositMoney(200000);
        bankAccount2.depositMoney(50000);

        System.out.println();

        bankAccount1.withdrawMoney(100000);
        bankAccount2.withdrawMoney(300000);

        System.out.println();

        bankAccount1.displayInfo();
        bankAccount2.displayInfo();

    }
}