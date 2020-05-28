package Generics.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Bubble Sort starts here------------");
        ISortOperations bubbleObj = new BubbleSort();
        int[] inputArr = {5,4,3,2,1};
        bubbleObj.ascendingSort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
}
