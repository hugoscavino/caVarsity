package exam;

import java.util.Arrays;

public class LeftShiftArray {
    public static int[] leftMove(int[] nums) {
        int[] result = new int[nums.length];

        int firstPos = nums[0];
        result[nums.length-1] = firstPos;

        for (int i = 0; i < nums.length; i++) {
            if (i != 0){
                result[i-1] = nums[i];
            }
        }

        return  result;
    }

    public static void main(String[] args) {
        int[] result = leftMove(new int[]{6, 2, 5, 3}); //should return [2, 5, 3, 6]
        System.out.println(Arrays.toString(result));

        int[] result2 = leftMove (new int[]{1, 2}); //should return [2, 1]
        System.out.println(Arrays.toString(result2));

        int[] result3 = leftMove(new int[]{1}); //should return [1]
        System.out.println(Arrays.toString(result3));
    }
}
