public class BankAccount {

    int AccountNumber;
    String Name;
    double balance;
    public BankAccount(int AccountNumber, String Name, double balance)
    {
        this.AccountNumber = AccountNumber;
        this.Name = Name;
        this.balance = balance;}
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(" deposit successful.");}
    public void displayBalance() {
        System.out.println(" Balance: " + balance);
    }
    public void withdraw(double amount)
            throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }
        balance = balance - amount;
        System.out.println(" withdrawn successful.");
    }
}
