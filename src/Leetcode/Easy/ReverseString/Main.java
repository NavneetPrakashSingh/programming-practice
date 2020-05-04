package Leetcode.Easy.ReverseString;

import java.util.Arrays;

public class Main {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        char[] input = {'H','e','l','l','o'};
        mainObj.reverseString(input);
        System.out.println(Arrays.toString(input));
    }
}
