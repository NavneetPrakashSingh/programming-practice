package Leetcode.PlusOne;

import java.util.Arrays;

public class plusONe {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            int[] newDigit = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                newDigit[i] = digits[i];
            }
            newDigit[newDigit.length - 1] = 0;
            newDigit[newDigit.length - 2] = digits[newDigit.length - 2]+1;
            return newDigit;
        } else {
            int[] newDigit = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                newDigit[i] = digits[i];
            }
            newDigit[digits.length - 1] = newDigit[digits.length - 1] + 1;
            return newDigit;
        }
    }

    public static void main(String[] args) {
        int[] intput = {9};
        System.out.println(Arrays.toString(plusONe.plusOne(intput)));
    }
}
