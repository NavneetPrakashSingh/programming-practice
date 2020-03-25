package Leetcode.RegularExpression;

public class Main {
    public static void main(String[] args){
        Dp dp = new Dp();
        System.out.println(dp.matchExpression("xaabyc","xa*b.c"));
    }
}
