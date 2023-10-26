import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        final int EMPLOYEES = 3; // Number of employees

        int[] hours = new int[EMPLOYEES]; // Array of hours

        //Create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees");


        //Get the hours worked by employee 1
        System.out.println("Employee 1: ");
        hours[0] = input.nextInt();

        System.out.println("Employee 2: ");
        hours[1] = input.nextInt();

        System.out.println("Employee 3: ");
        hours[2] = input.nextInt();


        //Display the values entered
        System.out.println("The hours entered are");
        System.out.println(hours[0]);
        System.out.println(hours[1]);
        System.out.println(hours[2]);
    }
}
