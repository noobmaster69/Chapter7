package CH7_Arrays;

public class VarargsDemo2 {
    public static void main(String[] args) {

        double total; // To hold the total balances

        //Create a BankAccount object with $100
        BankAccount account1 = new BankAccount(100.0);

        //Create a BankAccount object with $500
        BankAccount account2 = new BankAccount(500.0);

        //Create a BankAccount object with $1500
        BankAccount account3 = new BankAccount(1500.00);

        //Call the method with one argument
        total = totalBalance(account1);
        System.out.println("Total: $" + total);

        //Call the method with two arguments
        total = totalBalance(account1, account2);
        System.out.println("Total: $" + total);

        //Call the method with three arguments
        total = totalBalance(account1, account2, account3);
        System.out.println("Total: $" + total);


    }

    /**
     * The totalBalance method takes a variable number
     * of BankAccount objects and returns the total
     * of their balances
     * @param accounts The target account or accounts
     * @return The sum of the account balances
     */

    public static double totalBalance(BankAccount... accounts){

        double total = 0.0; // Accumulator

        //Add all the values in the accounts array
        for(BankAccount acctObject: accounts){
            total += acctObject.getBalance();
        }

        //Return the total
        return total;
    }
}
