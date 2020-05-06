package CrackingTheCodingInterview.Arrays;
//determine if a string has unique char

import java.util.HashMap;

public class Unique {
    boolean areChractersUnique(String str) {

        // An integer to store presence/absence
        // of 26 characters using its 32 bits.
        int checker = 0;

        for (int i = 0; i < str.length(); ++i) {
            int val = (str.charAt(i) - 'a');

            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return false;

            // set bit in checker
            checker |= (1 << val);
        }

        return true;
    }

    public boolean unique(String str) {
        if (str == null) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (map.containsKey(strArray[i])) {
                int value = map.get(strArray[i]);
                map.put(strArray[i], value + 1);
            } else {
                map.put(strArray[i], 1);
            }
        }
        for (Character key : map.keySet()) {
            if (map.get(key) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Unique unique = new Unique();
        System.out.println(unique.unique("naveet"));
        System.out.println(unique.areChractersUnique("naveet"));
    }
}
