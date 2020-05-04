package Leetcode.Easy.RemovingDuplicateFromSortedArray;

//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//Complexity: 0(n)
import java.util.Arrays;

public class Main {
    public int removeDuplicate(int[] input) {
        int firstPointer = 0;
        for (int i = 0; i < input.length-1; i++) {
            if(input[i]!=input[i+1]){
                firstPointer++;
                input[firstPointer] = input[i+1];
            }
        }
        System.out.println(String.valueOf(firstPointer+1));
        return firstPointer;
    }

    public static void main(String[] args) {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Main mainObj = new Main();
        mainObj.removeDuplicate(input);
        System.out.println(Arrays.toString(input));
    }
}
