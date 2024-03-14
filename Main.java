
public class Main {
    public static void main(String[] args) {
        Account acc1 = new CheckingAccount(1000.0, 500.0);
        acc1.withdraw(800.0); // Berhasil, saldo menjadi 200.0
        acc1.withdraw(400.0); // Berhasil, saldo menjadi 0.0, overdraft protection menjadi 100.0
        acc1.withdraw(600.0); // Gagal, karena overdraft protection tidak cukup
        
        SavingAccount acc2 = new SavingAccount(500.0, 0.05);
        acc2.deposit(100.0); // Berhasil, saldo menjadi 600.0
        double interest = acc2.calculateInterest(); // Bunga 30.0

        System.out.println("Saldo Checking Account: " + acc1.getBalance());
        System.out.println("Overdraft Protection: " + ((CheckingAccount) acc1).getOverdraftProtection());
        System.out.println("Saldo Saving Account: " + acc2.getBalance());
        System.out.println("Bunga Saving Account: " + interest);
    }
}