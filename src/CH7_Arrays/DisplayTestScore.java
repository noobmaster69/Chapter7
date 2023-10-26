package CH7_Arrays;

import java.util.Scanner;

public class DisplayTestScore {
    public static void main(String[] args) {

        int numTests; //The number of tests
        int[] tests; //Array of test scores

        //Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        //Get the number of test scores
        System.out.println("How many tests do you have?");
        numTests = keyboard.nextInt();

        //Create an array to hold that number of scores
        tests = new int[numTests];

        //Get the individual test scores
        for (int i = 0; i < tests.length; i++) {
            System.out.println("Enter test score " + (i + 1) + ": ");
            tests[i] = keyboard.nextInt();

        }

        //Display the test scores
        System.out.println();
        System.out.println("Here are the test scores you entered");
        for (int test : tests) {
            System.out.println(test + " ");

        }
    }
}
