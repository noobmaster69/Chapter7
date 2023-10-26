package CH7_Arrays;

public class PassElements {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

        for (int number : numbers) {
            showValue(number);

        }
    }

    /**
     * The showValue method displays its argument
     * @param number The value to display
     */
    private static void showValue(int number) {

        System.out.print(number + " ");
    }
}
