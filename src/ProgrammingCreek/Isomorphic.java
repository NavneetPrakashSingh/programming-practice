package ProgrammingCreek;

import java.util.Arrays;
import java.util.*;
public class Isomorphic{

    public boolean checkIfIsomorphic(String firstString, String otherString){
        if(firstString.length() != otherString.length()){
            return false;
        }
        char[] firstCharArr = firstString.toCharArray();
        char[] secondCharArr = otherString.toCharArray();
        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0;i<firstCharArr.length;i++){
            char firstStringChar = firstCharArr[i];
            char secondStringChar = secondCharArr[i];
            if(map.containsKey(firstStringChar)){
                char valueOfChar = map.get(firstStringChar);
                if(secondStringChar != valueOfChar){
                    return false;
                }
            }else{
                map.put(firstStringChar,secondStringChar);
            }
        }
        return true;
    }

    public static void main(String[] args){
        //check if two string are isomorphic or not
        //e.g acab and xcxb is isomorphic because is we change a to x we get the same string as the other string is
        String firstString = "acaba";
        String secondString = "xcxbn";

        Isomorphic hwObj = new Isomorphic();
        System.out.println(hwObj.checkIfIsomorphic(firstString, secondString));
    }

}