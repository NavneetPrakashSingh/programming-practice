package Sorting;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int[] input) {
        //merge sort uses recursion to sort elements in array
        //defining base condition here
        if (input.length <= 1) {
            return input;
        }
        int midpoint = input.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if (input.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }
        for (int i = 0; i < midpoint; i++) {
            left[i] = input[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = input[midpoint + i];
        }
        left = sort(left);
        right = sort(right);
        int[] result;
        result = merge(left, right);
        return result;
    }

    private int[] merge(int[] left, int[] right) {
        int[] resultArray = new int[left.length + right.length];
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        //parsing both arrays at once
        while (leftPointer < left.length || rightPointer < right.length) {
            //if both the arrays have unparsed values
            if (leftPointer < left.length && rightPointer < right.length) {
                if(left[leftPointer]<right[rightPointer]){
                    resultArray[resultPointer++] = left[leftPointer++];
                }else{
                    resultArray[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                resultArray[resultPointer++] = left[leftPointer++];
            } else {
                resultArray[resultPointer++] = right[rightPointer++];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println("--------Merge Sort starts here------------");
        MergeSort mergeSortObj = new MergeSort();
        int[] inputArr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSortObj.sort(inputArr)));
    }
}
