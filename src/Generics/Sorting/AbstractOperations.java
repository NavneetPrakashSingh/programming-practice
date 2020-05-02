package Generics.Sorting;

public abstract class AbstractOperations {
    public void swap(int firstElement, int secondElement){
        int temp = firstElement;
        firstElement = secondElement;
        secondElement = firstElement;
    }
}
