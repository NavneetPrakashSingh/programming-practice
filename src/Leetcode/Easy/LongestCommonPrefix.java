package Leetcode.Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String returningString = "";
        if (strs.length <= 0) {
            return returningString;
        }
        int index = 0;
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].length() < strs[i + 1].length()) {
                index = i;
            }else{
                index = i+1;
            }
        }
        for (int i = 0; i < strs[index].length(); i++) {
            char currentElement = strs[index].charAt(i);
            int count = 0;
            for (int j = 1; j < strs.length; j++) {
                if (currentElement == strs[j].charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == strs.length - 1) {
                returningString += strs[0].charAt(i);
            }else{
                break;
            }
        }
        return returningString;
    }
}
