package Leetcode.RegularExpression;

public class Dp {
    public Boolean matchExpression(String text, String regex) {
        boolean T[][] = new boolean[text.length()][regex.length()];
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < regex.length(); j++) {
                if (i == 0 && j == 0) {
                    T[i][j] = true;
                } else {
                    T[i][j] = false;
                }
            }
        }
        for (int i = 1; i < text.length(); i++) {
            for (int j = 1; j < regex.length(); j++) {
                if (text.charAt(i - 1) == regex.charAt(j - 1) || regex.charAt(j - 1) == '.') {
                    T[i][j] = T[i - 1][j - 1];
                } else if (regex.charAt(j - 1) == '*') {
                    T[i][j] = T[i][j - 2];
                    if (regex.charAt(j-2) == '.' || text.charAt(i - 1) == regex.charAt(j - 2)) {
                        T[i][j] = T[i - 1][j];
                    }
                }
            }
        }
        return T[text.length()-1][regex.length()-1];
    }
}
