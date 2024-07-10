import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        int balance = 10000; // Initial balance
        int withdrawal, deposit;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("1. Withdraw Cash");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    withdrawal = scanner.nextInt();
                    if (withdrawal > balance) {
                        System.out.println("Insufficient Funds!");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Amount withdrawn: " + withdrawal);
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("Amount deposited: " + deposit);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}