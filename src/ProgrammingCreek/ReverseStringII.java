package ProgrammingCreek;

public class ReverseStringII {
    public static void main(String[] args){
        //given an input stirng reverse words word by word
        String inputString="fox ate the cat";
        String[] stringArr = inputString.split(" ");

        int lengthOfStringArray = stringArr.length;
        for(int i=0;i<lengthOfStringArray/2;i++){
            String temp =stringArr[i];
            stringArr[i] = stringArr[lengthOfStringArray - 1 - i];
            stringArr[lengthOfStringArray - 1 -i] = temp;
        }
        for(int i = 0;i<lengthOfStringArray;i++){
            System.out.println(stringArr[i]);
        }
    }
}
