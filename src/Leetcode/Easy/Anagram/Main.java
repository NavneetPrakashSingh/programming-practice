package Leetcode.Easy.Anagram;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> firstStringMap = new HashMap<>();
        Map<Character,Integer> secondStringMap = new HashMap<>();
        countOccurance(s,firstStringMap);
        countOccurance(t,secondStringMap);
        for (int i = 0; i < s.length(); i++) {
            if(!firstStringMap.get(s.charAt(i)).equals(secondStringMap.get(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    private void countOccurance(String s, Map<Character, Integer> firstStringMap) {
        char[] stringArray = s.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if(firstStringMap.containsKey(stringArray[i])){
                int value = firstStringMap.get(stringArray[i]);
                firstStringMap.put(stringArray[i],value+1);
            }else{
                firstStringMap.put(stringArray[i],1);
            }
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        String s = "car";
        String r ="cat";
        System.out.println(mainObj.isAnagram(s,r));
    }
}
