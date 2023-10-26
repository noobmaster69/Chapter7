package CH7_Arrays;

import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 4; //Size of the array

        //Create an array
        int[] numbers = new int[ARRAY_SIZE];

        //Pass the array to the getValue method
        getValues(numbers);

        System.out.println("Here are the numbers that you entered");

        //Pass the array to the showArray Method
        showArray(numbers);

    }

    /**
     * The showArray method accepts an array as
     * an argument and displays its contents.
     * @param numbers A reference to the array
     */
    private static void showArray(int[] numbers) {

        //Display the array elements
        for (int number : numbers) {
            System.out.println(number + " ");

        }
    }

    /**
     * The getValues method accepts a reference
     * to an array as its argument. The user is
     * asked to enter a value for each element
     * @param numbers A reference to the array
     */
    private static void getValues(int[] numbers) {
        //Create a Scanner objects for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a series of " +
                numbers.length + " numbers.");

        //Read values into the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = keyboard.nextInt();

        }
    }
}
