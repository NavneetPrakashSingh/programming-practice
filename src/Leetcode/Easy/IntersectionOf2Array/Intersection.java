package Leetcode.Easy.IntersectionOf2Array;

import java.util.*;

public class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] largerArray = nums1.length > nums2.length ? nums1 : nums2;
        int[] smallerArray = nums1.length > nums2.length ? nums2 : nums1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < largerArray.length; i++) {
            for (int j = 0; j < smallerArray.length; j++) {
                if (largerArray[i] == smallerArray[j]) {
                    list.add(largerArray[i]);
                    smallerArray[j] = -1;
                    largerArray[i] = -1;
                    break;
//                    i++;
                }
            }
        }
//        List<Integer> list = new ArrayList<>(set);
        int[] returningInt = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            returningInt[i] = list.get(i);
        }
        return returningInt;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(Intersection.intersect(nums1, nums2)));
    }
}
