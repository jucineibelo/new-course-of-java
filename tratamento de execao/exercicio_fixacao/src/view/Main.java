package view;

import model.entities.Account;
import model.exceptions.MinhaException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.println("Number:");
            int number = sc.nextInt();
            System.out.println("Holder");
            String holder = sc.next();
            System.out.println("Initial balance");
            double balance = sc.nextDouble();
            System.out.println("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.println("Enter amount for withdraw:");
            double withdraw = sc.nextDouble();

            account.withdraw(withdraw);
            System.out.println("New balance: " + account.getBalance());
        } catch (MinhaException e) {
            System.out.println("Minha exceção tratada! " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error, invalid caracter " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}