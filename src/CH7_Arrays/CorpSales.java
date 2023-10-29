package CH7_Arrays;

import java.util.Scanner;

public class CorpSales {
    public static void main(String[] args) {

        final int DIVS = 3; // Three divisions in the company
        final int QTRS = 4; // Four quarters
        double totalSales = 0.0; //Accumulator


        //Create an array to hold the sales for each
        //division for each quarter

        double[][] sales = new double[DIVS][QTRS];

        //Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        //Display an introduction
        System.out.println("This program will calculate the total sales of");
        System.out.println("all the company's divisions. " +
                "Enter the following sales data:");

        //Nested loops to fill the array with quarterly
        //sales figures for each division
        for (int i = 0; i < DIVS; i++) {
            for (int j = 0; j < QTRS; j++) {
                System.out.printf("Division %d, Quarter %d: $",
                        (i + 1) , (j + 1));

                sales[i][j] = input.nextDouble();

            }
            System.out.println();

        }

        //Nested loops to all the elements of the array
        for (int i = 0; i < DIVS; i++) {
            for (int j = 0; j < QTRS; j++) {
                totalSales += sales[i][j];

            }

        }

        //Display the total sales
        System.out.printf("Total company sales: $%,.2f\n", totalSales);
    }
}
