class BankAccount {
    private double balance;

    // Getter
    public double getBalance() {
        return this.balance;
    }

    // Setter(deposit money)
    public void setDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Setter(withdraw money)
    public void setWithdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myacc = new BankAccount();
        myacc.setDeposit(1000);
        myacc.setWithdraw(300);
        System.out.println("Balance : " + myacc.getBalance());
    }
}