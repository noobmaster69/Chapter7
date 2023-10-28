package CH7_Arrays;

import java.util.Scanner;

public class CalcAverage {
    public static void main(String[] args) {

        int numScores; // To hold the number of scores

        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //Get the number of test scores
        System.out.println("How many test scores do you have? ");
        numScores = input.nextInt();

        //Create an array to hold the test scores
        double[] scores = new double[numScores];

        //Get the test scores and store them in the array
        for (int i = 0; i < numScores; i++) {
            System.out.println("Enter score #" + (i + 1) + ": ");
            scores[i] = input.nextDouble();

        }

        //Create a Grader object, passing the
        //scores array as an argument to the constructor
        Grader myGrader = new Grader(scores);

        //Display the adjusted average
        System.out.println("Your adjusted average is " + myGrader.getAverage());

        //Display the lowest score
        System.out.println("Your lowet test score was " + myGrader.getLowestScore());
    }
}
