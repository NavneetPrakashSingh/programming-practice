package Generics.Sorting;

public abstract class AbstractOperations {
    public int[] swap(int firstElement, int secondElement){
        int temp = firstElement;
        firstElement = secondElement;
        secondElement = temp;

        return new int[]{firstElement,secondElement};
    }
}
