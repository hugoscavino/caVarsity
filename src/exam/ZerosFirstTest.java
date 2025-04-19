package exam;

import java.util.Arrays;

public class ZerosFirstTest{

    public static int[] zerosFirst(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int index = 0;
        for (int j : arr) {
            if (j == 0) {
                sortedArray[index] = j;
                index++;
            }
        }

        for (int value : arr) {
            if (value != 0) {
                sortedArray[index] = value;
                index++;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] result = zerosFirst(new int[]{1,0,0,1}); //should return [0, 0, 1, 1]
        System.out.println(Arrays.toString(result));

        int[] result2 = zerosFirst(new int[]{0,1,1,0,1}); //should return [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(result2));

        int[] result3 = zerosFirst(new int[]{1,0}); //should return [0, 1]
        System.out.println(Arrays.toString(result3));

    }
}
