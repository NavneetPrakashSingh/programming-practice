package Generics.Sorting;

public class BubbleSort extends AbstractOperations implements ISortOperations {

    @Override
    public void ascendingSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if(input[j]>input[j+1]){
                    int[] tempArr = swap(input[j],input[j+1]);
                    input[j] = tempArr[0];
                    input[j+1] = tempArr[1];
                }
            }
        }
    }

    @Override
    public void descendingSort(int[] input) {

    }
}
