package Sorting;

import java.util.Arrays;

public class QuickSort {
    public int partition(int[] input, int low, int high) {
        int pivot = high;
        int begin = low;
        for (int i = low; i < input.length; i++) {
            if(input[i]<input[pivot]){
                int temp = input[i];
                input[i] = input[begin];
                input[begin] = temp;
                begin++;
            }
        }
        int temp = input[begin];
        input[begin] = input[pivot];
        input[pivot] = temp;
        return begin;
    }

    public void quick(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        quick(arr, low, pivot - 1);
        quick(arr, pivot + 1, high);
    }

    public static void main(String[] args) {
        int[] input = {5, 4, 3, 2, 1};
        QuickSort sortObj = new QuickSort();
        sortObj.quick(input, 0, input.length-1);
        System.out.println(Arrays.toString(input));
    }
}
