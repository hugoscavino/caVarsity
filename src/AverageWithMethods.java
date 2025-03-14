import java.util.Scanner;

public class AverageWithMethods {

    static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5-10 number of elements to average");
        return scanner.nextLine();
    }

    static double getAverage(String inputString) {
        int tokens = 0;
        double sum = 0;
        Scanner strInput = new Scanner(inputString);
        while (strInput.hasNext()) {
            tokens++;
            sum += strInput.nextInt();
        }
        return sum / tokens;

    }

    static void printStringAndAverage(String outputString, double average) {
        System.out.printf("The average of %s is %.2f \n", outputString, average);

    }
    public static void main(String[] args) {
        String inputString = getInputString();
        //System.out.println("Found inputString : " + inputString);
        Scanner strInput = new Scanner(inputString);
        int tokens = 0;
        while (strInput.hasNext()) {
            tokens++;
            strInput.nextInt();
        }
        //System.out.println("Found tokens : " + tokens);

        boolean invalidTokens = (tokens < 5 || tokens > 10);
        if (invalidTokens) {
            System.out.println("Invalid tokens. Please enter 5 - 10");
        }
        double average = getAverage(inputString);
        printStringAndAverage(inputString, average);
    }
}
