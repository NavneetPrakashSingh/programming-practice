package ProgrammingCreek;
import java.util.*;
public class ReversePolishNotion {
    public int performOperation(String[] input){
        String validOperations = "+-*/";
        Stack<String> stack = new Stack<>();
        for(int i=0;i<input.length;i++){
            if(!validOperations.contains(input[i])){
                stack.push(input[i]);
            }else{
                int firstElement = Integer.valueOf(stack.pop());
                int secondElement = Integer.valueOf(stack.pop());
                int indexOfOperator = validOperations.indexOf(input[i]);
                switch(indexOfOperator){
                    case 0: stack.push(String.valueOf(firstElement + secondElement)); break;
                    case 1: stack.push(String.valueOf(firstElement - secondElement)); break;
                    case 2: stack.push(String.valueOf(firstElement * secondElement)); break;
                    case 3: stack.push(String.valueOf(firstElement / secondElement)); break;
                }
            }
        }
        return Integer.valueOf(stack.pop());

    }

    public static void main(String []args){
        //reverse polish notion
        String[] input = {"2", "1", "+", "3", "*"};
        ReversePolishNotion hwObj = new ReversePolishNotion();
        System.out.println(hwObj.performOperation(input));

    }
}
