package Medium.SlidingWIndow;

import java.util.HashMap;

public class SlidingWindow {
    public String minWindow(String s, String t){
        if(s==null || t==null){
            return null;
        }
        char[] stringArray = s.toCharArray();
        char[] patternCharArray = t.toCharArray();
        HashMap<Character,Integer> table = new HashMap<>();
        for (int i = 0; i < patternCharArray.length; i++) {
            if(table.containsKey(patternCharArray[i])){
                int value = table.get(patternCharArray[i]);
                table.put(patternCharArray[i],value+1);
            }else{
                table.put(patternCharArray[i],1);
            }
        }

        int begin =0 , end = 0;
        String ans ="";
        int length= Integer.MAX_VALUE;
        int counter = 0;
        for(char i:table.keySet()){
            counter = counter + table.get(i);
        }

        while(end< stringArray.length){
            if(table.containsKey(stringArray[end])){
                int currentValueCount = table.get(stringArray[end]);
                table.put(stringArray[end],currentValueCount-1);
                if(currentValueCount == 0){
                    counter--;
                }
            }
            end++;
            while(counter==0){
                //update previous value here
                if(end-begin<length){
                    length = end-begin;
                    ans=s.substring(begin,end);
                }

                //now we are moving towards next begin char, we see that if it exists in table, we inc its value
                if(table.containsKey(stringArray[begin])){
                    int value = table.get(stringArray[begin]);
                    table.put(stringArray[begin],value+1);
                    if(table.get(stringArray[begin])>0){
                        counter++;
                    }
                }
                begin++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str= "adobecodebanc";
        String pattern = "abc";
        SlidingWindow sWindow = new SlidingWindow();
        System.out.println(sWindow.minWindow(str,pattern));
    }
}
