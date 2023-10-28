package CH7_Arrays;

public class BankAccount {

    private double balance; // Account balance

    /**
     * This constructor sets the starting balance at 0.0
     */
    public BankAccount(){
        balance = 0.0;
    }

    /**
     * This constructor sets the starting balance
     * to the value passed as an argument
     * @param startBalance The starting balance
     */
    public BankAccount(double startBalance){
        balance = startBalance;

    }

    /**
     * This constructor sets the starting balance
     * to the value in the String argument
     * @param str The starting balance, as a String
     */

    public BankAccount(String str){
        balance = Double.parseDouble(str);

    }


    /**
     * The deposit method makes a deposit into
     * the account
     * @param amount The amount to add to the balance field
     */
    public void deposit(double amount){
        balance += amount;
    }


    /**
     * The deposit method makes a deposit into
     * the account
     * @param str The amount to add to the balance field as a String
     */
    public void deposit(String str){
        balance += Double.parseDouble(str);
    }



    public void withdraw(double amount){
        balance -= amount;
    }

    public void withdraw(String str){
        balance -= Double.parseDouble(str);


    }

    public void setBalance(double b){
        balance = b;
    }

    public void setBalance(String str){
        balance = Double.parseDouble(str);
    }

    public double getBalance(){
        return balance;
    }

}
