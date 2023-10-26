package CH7_Arrays;

public class SalesData {
    private double[] sales; //The sales data


    /**
     * The constructor copies the elements in
     * an array to the sales array
     * @param s The array to copy
     */
    public SalesData(double[] s){
        //Create an array as large as s
        sales = new double[s.length];

        //Copy the elements from s to sales
        for (int i = 0; i < s.length; i++) {
            sales[i] = s[i];

        }

    }

    /**
     * getTotal method
     * @return The total of the elements in
     * the sales array
     */
    public double getTotal(){
        double total = 0.0; //Accumulator

        //Accumulate the sum of the elements
        //in the sales array
        for (double sale : sales) {
            total += sale;


        }
        //Return the total
        return  total;
    }

    /**
     * getAverage method
     * @return The average of the elements
     * in the sales array
     */

    public double getAverage(){
        return getTotal() / sales.length;
    }

    /**
     * getHighest method
     * @return The highest value stored
     * in the sales array
     */
    public double getHighest(){

        double highest = sales[0];

        for (double sale : sales) {
            if (sale > highest) {
                highest = sale;
            }

        }
        return highest;
    }


    /**
     * getLowest method
     * @return The lowest value stored
     * in the sales array
     */
    public double getLowest(){
        double lowest = sales[0];

        for (double sale : sales) {
            if (sale < lowest) {
                lowest = sale;
            }

        }
        return lowest;
    }
}
