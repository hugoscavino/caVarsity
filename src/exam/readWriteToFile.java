package exam;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class readWriteToFile {
    public static String FILENAME = "numbers.txt";

    public static String writeIntsToFile(ArrayList<Integer> nums) {

        File file = new File(FILENAME);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (int i : nums) {
                writer.write(Integer.toString(i));
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        return file.getAbsolutePath();
    }

    public static ArrayList<Integer> readDataFromFile(String fileName) {
        ArrayList<Integer> result = new ArrayList<>();
        File file = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String line = reader.readLine();
                result.add(Integer.parseInt(line));
            }
            System.out.println("Successfully read from file : " + FILENAME);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        return result;
    }

    public static void main(String[] args)  {

        ArrayList<Integer> saleData = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        String fn = writeIntsToFile(saleData);
        System.out.println(fn);

        ArrayList<Integer> integers = readDataFromFile(fn);
        System.out.println(integers);
    }
}
