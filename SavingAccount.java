public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Method tambahan untuk menghitung bunga
    public double calculateInterest() {
        return balance * interestRate;
    }
}