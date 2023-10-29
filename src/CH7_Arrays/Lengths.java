package CH7_Arrays;

import java.util.Arrays;

public class Lengths {
    public static void main(String[] args) {

        //Declare a 2D array with 3 rows
        //and 4 columns

        int[][] numbers = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12}};

        //Display  the number of rows
        System.out.println("The number of rows is " + numbers.length);

        //Display the number of columns in each row
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The number of columns in row " + i + " is " + numbers[i].length);

        }

        testing();
    }

    public static void testing(){

        int[][] evens = {{2,4,6,8},
                {10, 12, 14, 16},
                {18, 20, 22, 24}};
        int[][] odds = {{1, 3, 5, 7},
                {9, 11, 13, 15, 17},
                {19, 21, 23, 25}};

        for (int i = 0; i < evens.length; i++) {
            for (int j = 0; j < odds.length; j++) {

                System.out.println(Arrays.toString(evens[i]) + " " + i);

            }

        }
    }
}
