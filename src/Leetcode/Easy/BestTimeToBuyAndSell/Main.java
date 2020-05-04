package Leetcode.Easy.BestTimeToBuyAndSell;

//Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
//key is that if you plot the graph, you see that you need to add those values that have increasing value/slope.

public class Main {

    public int maxProfit(int[] input){
        int totalProfit =0;
        for (int i = 0; i < input.length-1; i++) {
            if(input[i]<input[i+1]){
                totalProfit = totalProfit+ (input[i+1]-input[i]);
            }
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        Main mainObj = new Main();
        System.out.println(mainObj.maxProfit(input));
    }
}
