package Leetcode.Permutation;

public class Main {
    public static void main(String[] args) {
        String str = "ABC";
        Permute permute = new Permute();
        permute.permute(str,0,str.length()-1);
    }
}
