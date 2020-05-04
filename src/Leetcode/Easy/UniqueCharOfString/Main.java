package Leetcode.Easy.UniqueCharOfString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
public class Main {
    public int firstUniqChar(String s) {

        HashMap<Character,List<Integer>> map = new HashMap<>();
        char[] inputStringArray = s.toCharArray();
        for (int i = 0; i < inputStringArray.length; i++) {
            if(map.containsKey(inputStringArray[i])){
               List<Integer> currentList = map.get(inputStringArray[i]);
               currentList.add(i);
               map.put(inputStringArray[i],currentList);
            }else{
                List<Integer> currentList = new ArrayList<>();
                currentList.add(i);
                map.put(inputStringArray[i],currentList);
            }
        }
        for (int i = 0; i < inputStringArray.length; i++) {
            if(map.get(inputStringArray[i]).size()==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "";
        Main mainObj = new Main();
        System.out.println(mainObj.firstUniqChar(s));
    }
}
