package ProgrammingCreek;
import java.util.*;
import java.util.Stack;

public class ValidParenthesis {
    //Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    public boolean validate(String input){

        char[] inputChar = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for (char currentChar : inputChar) {
            if (map.keySet().contains(currentChar)) {
                stack.push(currentChar);
            } else if (map.values().contains(currentChar)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == currentChar) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String input = "()";
        ValidParenthesis parenthesisObj = new ValidParenthesis();
        System.out.println(parenthesisObj.validate(input));

    }
}
