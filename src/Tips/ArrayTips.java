package Tips;

import java.util.Arrays;

public class ArrayTips {

    public static void main(String []args){
        String sampleString = "navneet";
        //TIP 1: printing character of a string at specific index
        System.out.println(sampleString.charAt(0));
        //TIP 2: printing the length of the string
        System.out.println(sampleString.length());
        //TIP 3: printing the substring from current index to last
        System.out.println(sampleString.substring(2));
        //TIP 4: printing the substring from current o nth index
        System.out.println(sampleString.substring(0,7));

        // TIP 5: converting a string to character array
        char[] stringArray = sampleString.toCharArray();
        //TIP 6: printing the character at 0 position of the char array
        System.out.println(stringArray[0]);
        //TIP 7: printing the length of the character array
        System.out.println(stringArray.length);
        //TIP 8: converting a char array to string
        Arrays.toString(stringArray);
        System.out.println(stringArray);
        //TIP 9: copying the char array to new char array
        char[] newArray = Arrays.copyOf(stringArray,3);
        System.out.println(newArray);

        //tip 10: converting string to integer
        String temp = "2";
        System.out.println(Integer.valueOf(temp));

        //tip 11: converting integer to string
        Integer integerTemp = 2;
        System.out.println(String.valueOf(integerTemp));

        int[] unsortedArray = {3,2,4,1};
        //TIP 12: sorting an array
        Arrays.sort(unsortedArray);
        System.out.println(unsortedArray[2]);


    }
}