
// ATM INTERFACE

import java.util.*;

class Bank_account {

    private double balance;

    public Bank_account(double initial_balance) {
        this.balance = initial_balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class atm {

    private Bank_account account;

    public atm(Bank_account account) {

        this.account = account;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("deposit successful");
        } else {
            System.out.println("deposit failed");
        }
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdraw Successful $" + account.getBalance());
        } else {
            System.out.println("Withdraw Failed");
        }
    }

    public void check_balance() {
        System.out.println("Current Balance" + account.getBalance());
    }
}

public class TASK3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank_account user_account = new Bank_account(1000);
        atm atm = new atm(user_account);
        while (true) {
            System.out.println("\nATM menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("choose your option");
            int choice = sc.nextInt();

            double amount;
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to be deposit");
                    amount = sc.nextDouble();
                    atm.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdraw");
                    amount = sc.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 3:
                    atm.check_balance();
                    break;
                case 4:
                    System.out.println("Thank You for using this ATM. Goodbye! ");
                    return;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }
    }
}
