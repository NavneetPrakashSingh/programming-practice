package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int min = input[i];
            int minId = i;
            for (int j = i + 1; j < input.length; j++) {
                if (min > input[j]) {
                    min = input[j];
                    minId = j;
                }
            }
            //swapping starts here
            int temp = input[minId];
            input[minId] = input[i];
            input[i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("--------Selection Sort starts here------------");
        SelectionSort selectionSortObj = new SelectionSort();
        int[] inputArr = {5, 4, 3, 2, 1};
        selectionSortObj.sort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
}
