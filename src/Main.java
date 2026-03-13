import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        while (true) {

            System.out.print("Enter Account Number: ");
            int bankaccount = inp.nextInt();

            System.out.print("Enter  Name: ");
            String name = inp.next();

            System.out.print("Enter Balance: ");
            double balance = inp.nextDouble();

            BankAccount acc = new BankAccount(bankaccount, name, balance);
            accounts.add(acc);

            System.out.println("Account added successfully.");

            System.out.print("Enter Account Number to search: ");
            String search = inp.next();

            BankAccount found = null;

            for (BankAccount a : accounts) {
                if (search.equals(a.AccountNumber)) {
                    found = a;
                    break;
                }
            }

            if (found != null) {

                found.displayBalance();

                System.out.print("Enter amount to deposit: ");
                double dep = inp.nextDouble();
                found.deposit(dep);

                System.out.print("Enter amount to withdraw: ");
                double wit = inp.nextDouble();
                try {
                    found.withdraw(wit);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                found.displayBalance();

            } else {
                System.out.println("Account not found");
            }

            System.out.print("Add another account? (y/n): ");
            String ans = inp.next();

            if (ans.equals("n") || ans.equals("N")) {
                break;
            }
            double wit = inp.nextDouble();

            if (found != null) {
                try {
                    found.withdraw(wit);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Account not found");
            }
        }}}