package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] input){
        for (int i = 1; i < input.length; i++) {
            int current = input[i];
            int j = i-1;
            while (j>=0 && current<input[j]){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = current;
        }
    }
    public static void main(String[] args) {
        System.out.println("--------Insertion Sort starts here------------");
        InsertionSort insertionSortObj = new InsertionSort();
        int[] inputArr = {5,4,3,2,1};
        insertionSortObj.sort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
}
