import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    int accountNumber;
    String name;
    double balance;


    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }
        balance = balance - amount;
        System.out.println("Amount withdrawn successfully.");
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}