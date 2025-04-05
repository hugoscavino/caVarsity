import java.util.Arrays;
import java.util.Scanner;

/**
 * In Java, Define a method called exactChange that takes the total change
 * amount in cents and an integer array as parameters. Method
 * exactChange calculates the change using the fewest coins and
 * stores the number of each coin type used into the array parameter.
 * -
 * Index 0-3 of the array parameter should contain the number of
 * pennies, nickels, dimes, and quarters respectively.
 * -
 * Then write a main program that reads the total change amount
 * as an integer input, calls exactChange, and outputs the change,
 * one coin type per line.
 * -
 * Use singular and plural coin names as appropriate, like 1 penny vs. 2 pennies.
 * -
 * Output no change if the input is 0 or less.
 */
public class ExactChangeCalculator {
    static final int QUARTER_POS = 0;
    static final int DIME_POS = 1;
    static final int NICKLE_POS = 2;
    static final int PENNY_POS = 3;

    // Method to calculate exact change
    public static void exactChange(int userTotal, int[] coinsUsed) {

        for (int i = 0; i < 4; i++) {

            // Below line is an int so there are no fractions
            if (i == QUARTER_POS){
                coinsUsed[i] = userTotal / 25;
                // now get the remainder, if any
                userTotal = userTotal % 25;
            }
            if (i == DIME_POS){
                coinsUsed[i] = userTotal / 10;
                // now get the remainder, if any
                userTotal = userTotal % 10;
            }
            if (i == NICKLE_POS){
                coinsUsed[i] = userTotal / 5;
                // now get the remainder, if any
                userTotal = userTotal % 5;
            }

            if (i == PENNY_POS){
                coinsUsed[i] = userTotal / 1;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total change in cents:");

        int userTotal = scanner.nextInt();

        int[] coinsVals = new int[4]; // Indexes: 0=quarters, 1=dimes, 2=nickels, 3=pennies
        exactChange(userTotal, coinsVals);

        if (userTotal <= 0) {
            System.out.println("No change");
            return;
        }

        // System.out.println(Arrays.toString(coinsVals));
        for (int coinPosition = 0; coinPosition < coinsVals.length; coinPosition++) {

            // If we have coins of this denomination
            if (coinsVals[coinPosition] > 0) {

                System.out.print(coinsVals[coinPosition] + " ");

                // Use the plural version of the string
                boolean plural = coinsVals[coinPosition] > 1;

                switch (coinPosition){
                    case QUARTER_POS:
                        if (plural) {
                            System.out.println("Quarters");
                        } else {
                            System.out.println("Quarter");
                        }
                        break;
                    case DIME_POS:
                        if (plural) {
                            System.out.println("Dimes");
                        } else {
                            System.out.println("Dime");
                        }
                        break;
                    case NICKLE_POS:
                        if (plural) {
                            System.out.println("Nickles");
                        } else {
                            System.out.println("Nickle");
                        }
                        break;
                    case PENNY_POS:
                        if (plural) {
                            System.out.println("Pennies");
                        } else {
                            System.out.println("Penny");
                        }
                        break;
                    default:
                       break;
                }
            }
        }
    }

}