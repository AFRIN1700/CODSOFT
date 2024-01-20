import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayOptions() {
        System.out.println("     1. Withdraw");
        System.out.println("     2. Deposit");
        System.out.println("     3. Check Balance");
        System.out.println("     4. Exit");
    }

    public void performTransaction(int option, Scanner scanner) {
        switch (option) {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0) {
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("     ----------------------------------------------------");
                        System.out.println("        Withdrawal successful. Remaining balance: $" + userAccount.getBalance());
                        System.out.println("     ----------------------------------------------------");
                    }
                } else {
                    System.out.println("     ----------------------------------------------");
                    System.out.println("           Invalid amount. Withdrawal failed.");
                    System.out.println("     ----------------------------------------------");
                }
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    userAccount.deposit(depositAmount);
                    System.out.println("     ----------------------------------------------");
                    System.out.println("          Deposit successful. New balance: $" + userAccount.getBalance());
                    System.out.println("     ----------------------------------------------");
                } else {
                    System.out.println("     ----------------------------------------------");
                    System.out.println("            Invalid amount. Deposit failed.");
                    System.out.println("     ----------------------------------------------");
                }
                break;
            case 3:
                System.out.println("Your balance: $" + userAccount.getBalance());
                break;
            case 4:
                System.out.println("     ----------------------------------------------");
                System.out.println("                Exiting ATM. Thank you!");
                System.out.println("     ----------------------------------------------");
                System.exit(0);
            default:
                System.out.println("     ----------------------------------------------");
                System.out.println("      Invalid option. Please choose a valid option.");
                System.out.println("     ----------------------------------------------");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------ATM INTERFACE--------------------------");
        System.out.println();
        System.out.print("Enter your initial account balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        while (true) {
            atm.displayOptions();

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            atm.performTransaction(option, scanner);
        }
    }
}
