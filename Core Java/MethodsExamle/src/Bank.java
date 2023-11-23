public class Bank {

    private String accountNumber;
    private double balance;

    public Bank(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void transfer(Bank targetAccount, double amount) {
        if (balance >= amount) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " to " + targetAccount.accountNumber);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        Bank account1 = new Bank("12345", 1000.0);
        Bank account2 = new Bank("67890", 2000.0);

        account1.checkBalance(); // Check balance of account1

        account1.deposit(500.0); // Deposit $500 into account1
        account1.checkBalance(); // Check balance of account1

        account1.withdraw(200.0); // Withdraw $200 from account1
        account1.checkBalance(); // Check balance of account1

        account1.transfer(account2, 300.0); // Transfer $300 from account1 to account2
        account1.checkBalance(); // Check balance of account1
        account2.checkBalance(); // Check balance of account2
    }
}
