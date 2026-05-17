package org.example.Stack;

import java.util.Stack;

public class Question001 {

    public static void main(String[] args) {
        Question001 q = new Question001();
        boolean result=q.checkValidParentheses("(({[]}))");
        System.out.println("result :"+result);
    }

    //Valid Parentheses : Check whether "({[]})" is balanced.
    public boolean checkValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    Character pop = stack.pop();
                    if (c == ')' && pop != '(' || c == ']' && pop != '[' || c == '}' && pop != '{') {
                        return false;
                    }
                }
            }

        }
        return true;

    }
}
