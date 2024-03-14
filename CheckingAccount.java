
public class CheckingAccount extends Account {

    private double overdraftProtection;

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public CheckingAccount(double balance) {
        this(balance, -1.0);
    }

    @Override
    public boolean withdraw(double amt) {
        if (amt > 0) {
            if (balance - amt >= 0.0) {
                balance -= amt;
                return true;
            } else if (overdraftProtection >= 0.0 && overdraftProtection >= (amt - balance)) {
                balance = 0.0;
                overdraftProtection -= (amt - balance);
                return true;
            }
        }
        return false;
    }

    // Method tambahan untuk mengecek status overdraft protection
    public boolean hasOverdraftProtection() {
        return overdraftProtection >= 0.0;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }
}