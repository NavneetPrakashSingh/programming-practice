package Questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

public class FilePattern {
    //Algorithm used: To find the minumum possible time to merge N files into a single file out of all the time that we calculate using greedy approach
    //Step1: We create a priority queue as data structure because

    // Function to find minimum computation
    static int minComputation(int size, List<Integer> files)
    {

        // create a min heap
        PriorityQueue<Integer> pq
                = new PriorityQueue<>();

        for (int i = 0; i < size; i++) {

            // add sizes to priorityQueue
            pq.add(files.get(i));
        }

        // variable to count total computations
        int count = 0;

        while (pq.size() > 1) {

            // pop two smallest size element
            // from the min heap
            int temp = pq.poll() + pq.poll();

            // add the current computations
            // with the previous one's
            count += temp;

            // add new combined file size
            // to priority queue or min heap
            pq.add(temp);
        }

        return count;
    }

    public static void main(String[] args)
    {

        // no of files
        int size = 6;

        // 6 files with their sizes
//        int files[] = new int[] { 2, 3, 4, 5, 6, 7 };
        List<Integer> files = new LinkedList<>();
        files.add(2);
        files.add(3);
        files.add(4);
        files.add(5);
        files.add(6);
        files.add(7);

        // total no of computations
        // do be done final answer
        System.out.println("Minimum Computations = "
                + minComputation(size, files));
    }
}