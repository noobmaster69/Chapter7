package CH7_Arrays;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        final int EMPLOYEES = 3;

        int[] hours = new int[EMPLOYEES];

        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the hours worked by " +
                EMPLOYEES + " employees");

        //Get the hours for each employee
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ": ");
            hours[i] = keyboard.nextInt();

        }

        System.out.println("The hours you entered are");

        //Display the values entered
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println(hours[i]);

        }
    }
}
