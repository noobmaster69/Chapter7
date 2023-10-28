package CH7_Arrays;

import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {

        final int NUM_ACCOUNTS = 3; // Number of accounts

        //Create an array that can reference
        //BankAccount Objects
        BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];

        //Create objects for the array
        createAccounts(accounts);

        //Display the balances of each account
        System.out.println("Here are the balances for each account");

        for (int i = 0; i < accounts.length; i++) {

            System.out.println("Account " + (i + 1) +
                    ": $" + accounts[i].getBalance());

        }

    }

    private static void createAccounts(BankAccount[] array){

        double balance; // To hold an account balance

        //Create a scanner object
        Scanner input = new Scanner(System.in);


        //Create the accounts
        for (int i = 0; i < array.length; i++) {
            //Get the account's balance
            System.out.println("Enter the balance for " +
                    "account " + (i + 1) + ": ");

            balance = input.nextDouble();

            //Create the account
            array[i] = new BankAccount(balance);

        }
    }
}
