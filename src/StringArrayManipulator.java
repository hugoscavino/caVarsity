import java.util.Scanner;

/**
 * In this assignment, you will create two methods that manipulate string arrays.
 * They are described as below.
 * reverseArray: this method will reverse the elements of a String array and return a String array to the calling
 * methods. For example, if the input string array is ["a", "b", "c"].
 * the returning string array will be ["c", "b", "a"]|
 * -
 * makeSentence: this method create a sentence from a String array and return a String to the calling methods.
 * For example, if the input string is ["Hello", "World"], the returning
 * string will be "Hello World".
 * -
 * In the main method, the program will ask the user to enter a single word repeatedly until a period is the input,
 * indicating no more word to be entered. It then stores the words in a String array and calls the reverseArray method
 * to reverse the order of the word. Lastly, the (main method calls the makeSentence method using the result of
 * reverseArray to get a sentence to be printed out on the console.
 */
public class StringArrayManipulator {

    // Method to reverse a String array
    public static String[] reverseArray(String[] array) {

        String[] reversed = new String[array.length];
        /*
            int LAST_POS = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                reversed[i] = array[LAST_POS - i];
            }
        */

        //Count down using the counter
        int LAST_POS = array.length - 1;
        for (int i = LAST_POS; i >= 0; i--) {
            reversed[LAST_POS - i] = array[i];
        }
        return reversed;
    }

    // Method to create a sentence from a String array
    public static String makeSentence(String[] array) {
        String sentence = "";
        int LAST_POS = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            sentence += array[i];
            if (i < LAST_POS) {
                sentence += " ";
            }
        }
        return sentence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allWords = "";
        int numberOfWords = 0;

        while (true) {
            System.out.println("Enter words one by one. Enter a period (.) to finish:");
            String word = scanner.nextLine();
            if (word.equals(".")) {
                break;
            }
            allWords = allWords + " " + word;
            numberOfWords++;
        }

        Scanner wordsParser = new Scanner(allWords);
        String[] wordsArray = new String[numberOfWords];

        int counter = 0;
        while (wordsParser.hasNextLine()) {
            wordsArray[counter] = wordsParser.next();
            counter++;
        }

        // Reverse the array
        String[] reversedArray = reverseArray(wordsArray);

        // Create a sentence from reversed array
        String sentence = makeSentence(reversedArray);

        // Print the sentence
        System.out.println("Reversed sentence: " + sentence);
    }
}