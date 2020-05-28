package Leetcode.Easy.ImplementStrStr;

public class Main {
    public int strStr(String haystack, String needle) {

//        if(haystack.equals("") && needle.equals("")){
//            return 0;
//        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int i = 0; i <= haystackArray.length - needleArray.length; i++) {
            if(haystack.substring(i,i+needleArray.length).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.strStr("",""));
    }
}
