package composite.atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("231-2142-123", "Sornchai Somsakul", 2000);
        Atm atm = new Atm("126-8972-2312", "1234", bankAccount);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to KU Bank ATM");
        System.out.println("-----------------------");
        System.out.println("Enter your Account Id: ");
        String accountId = scanner.nextLine();
        int tryAmount = 3;

        if (atm.validateId(accountId)) {
            while (tryAmount > 0) {
                System.out.print("Enter your pin: ");
                String pin = scanner.nextLine();
                if (atm.validatePin(pin)) break;

                System.out.println("Wrong pin code!");
                tryAmount--;
                System.out.println("You have " + tryAmount + " tries left.");
            }

            if (tryAmount == 0) return;

            System.out.println("Login success");

            System.out.println("Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            while (true) {
                System.out.print("Enter menu: ");
                int menu = scanner.nextInt();
                scanner.nextLine();
                switch (menu) {
                    case 1:
                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        bankAccount.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        amount = scanner.nextDouble();
                        scanner.nextLine();
                        bankAccount.withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter account id: ");
                        String accountNumber = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        amount = scanner.nextDouble();
                        scanner.nextLine();
                        bankAccount.transfer(accountNumber, amount);
                        break;
                    case 4:
                        System.out.println(bankAccount.getBalance());
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid menu");
                }
            }

        } else {
            System.out.println("Account not found!");
        }
    }


}

