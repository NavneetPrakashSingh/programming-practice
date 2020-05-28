package Leetcode.Permutation;

import java.util.LinkedList;
import java.util.List;

public class Permute {
    public void permute(String str, int leftIndex, int rightIndex) {
        List<String> trackingList = new LinkedList<>();
        if (leftIndex == rightIndex) {
            System.out.println(str);
            trackingList.add(str);
        } else {
            for (int i = leftIndex; i <= rightIndex; i++) {
                str = swap(str, leftIndex, i);
                permute(str, leftIndex + 1, rightIndex);
                str = swap(str, leftIndex, i);
            }
        }
    }

    private String swap(String str, int leftIndex, int rightIndex) {
        char[] strArray = str.toCharArray();
        Character temp = strArray[leftIndex];
        strArray[leftIndex] = strArray[rightIndex];
        strArray[rightIndex] = temp;
        str = String.valueOf(strArray);
        return str;
    }
}
