package Leetcode.Easy.Palindrome;

public class Main {
    public boolean isPalindrome(String s) {
        int originalLength = s.length();
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9.]", "");
        if(s.length()!=originalLength){
            if(s.length()==1){
                return false;
            }
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
//        String s = "A man, a plan, a canal: Panama";
//        String s ="0P";
        String s = "a.";
        System.out.println(mainObj.isPalindrome(s));
    }
}
