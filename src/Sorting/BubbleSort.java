package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] input){
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                int max = input[j];
                if(max>input[j+1]){
                    int temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--------Bubble Sort starts here------------");
        BubbleSort bubbleObj = new BubbleSort();
        int[] inputArr = {5,4,3,2,1};
        bubbleObj.sort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
}
