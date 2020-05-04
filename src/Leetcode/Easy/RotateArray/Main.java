package Leetcode.Easy.RotateArray;

import java.util.Arrays;
//Given an array, rotate the array to the right by k steps, where k is non-negative.
public class Main {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int lastElement = nums[nums.length-1];
            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = lastElement;
        }
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        Main mainObj = new Main();
        mainObj.rotate(input,3);
        System.out.println(Arrays.toString(input));
    }
}
