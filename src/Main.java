import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();


        BankAccount acc = new BankAccount(1001, "Ali", 500);
        accounts.add(acc);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n1- Deposit");
            System.out.println("2- Withdraw");
            System.out.println("3- Check Balance");
            System.out.println("4- Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            try {

                if (choice == 1) {

                    System.out.print("Enter deposit amount: ");
                    double dep = input.nextDouble();
                    acc.deposit(dep);

                }
                else if (choice == 2) {

                    System.out.print("Enter withdraw amount: ");
                    double wit = input.nextDouble();
                    acc.withdraw(wit);

                }
                else if (choice == 3) {

                    acc.displayBalance();

                }
                else if (choice == 4) {

                    System.out.println("Program ended");

                }
                else {

                    System.out.println("Invalid choice");

                }

            }
            catch (Exception e) {

                System.out.println("Error: " + e.getMessage());

            }

        }

    }
}