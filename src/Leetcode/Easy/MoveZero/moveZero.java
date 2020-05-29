package Leetcode.Easy.MoveZero;

import java.util.Arrays;

public class moveZero {
    public static void moveZeroes(int[] arr) {
        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (0 != arr[i]) {
                arr[pointer] = arr[i];
                pointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] currentArray = {0, 1, 0, 3, 12};
        moveZero.moveZeroes(currentArray);
        System.out.println(Arrays.toString(currentArray));
    }
}
