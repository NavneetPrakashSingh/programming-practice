package Leetcode.Easy.ReverseInteger;

import java.util.Arrays;

public class Main {
    public int reverse(int x) {
        if(String.valueOf(x).length()<=1){
            return x;
        }
        boolean absValue = false;
        if(x<0){
            absValue = true;
            x = Math.abs(x);
        }
        String currentInteger = String.valueOf(x);
        char[] stringArray = currentInteger.toCharArray();
        for (int i = 0; i < stringArray.length/2; i++) {
            char temp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length-1];
            stringArray[stringArray.length-1] = temp;
        }
        currentInteger = String.valueOf(stringArray);
        if(absValue){
            currentInteger = "-".concat(currentInteger);
        }
        int returningIntValue = Integer.valueOf(currentInteger);

        return returningIntValue;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        System.out.println(mainObj.reverse(9000));
    }
}
