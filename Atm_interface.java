package programs;
import java.util.Scanner;

public class Atm_interface {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        double balance = 1000.00; // initial balance
        int choice;

        System.out.println(" WELCOME TO CodSoft ATM ");

        while(true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = ob.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = ob.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount Deposited Successfully!");
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = ob.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Funds!");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid Amount!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Please collect your cash!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    ob.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
