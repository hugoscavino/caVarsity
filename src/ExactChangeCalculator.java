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
    public static void exactChange(int totalChange, int[] coinsUsed) {

        for (int i = 0; i < 4; i++) {

            // Below line is an int so there are no fractions
            if (i == QUARTER_POS){
                coinsUsed[i] = totalChange / 25;
                // now get the remainder, if any
                totalChange %= 25;
            }
            if (i == DIME_POS){
                coinsUsed[i] = totalChange / 10;
                // now get the remainder, if any
                totalChange %= 10;
            }
            if (i == NICKLE_POS){
                coinsUsed[i] = totalChange / 5;
                // now get the remainder, if any
                totalChange %= 5;
            }

            if (i == PENNY_POS){
                coinsUsed[i] = totalChange / 1;
                // now get the remainder, if any
                totalChange %= 1;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total change in cents: ex. 57 for 57 cents");

        int totalChange = scanner.nextInt();

        int[] coinsUsed = new int[4]; // Indexes: 0=quarters, 1=dimes, 2=nickels, 3=pennies
        exactChange(totalChange, coinsUsed);

        if (totalChange <= 0) {
            System.out.println("No change");
            return;
        }

        // System.out.println(Arrays.toString(coinsUsed));
        for (int i = 0; i < coinsUsed.length; i++) {
            if (coinsUsed[i] > 0) {

                System.out.print(coinsUsed[i] + " : ");
                boolean plural = coinsUsed[i] > 1;

                switch (i){
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