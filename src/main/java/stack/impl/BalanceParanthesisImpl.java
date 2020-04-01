package stack.impl;

import stack.BalanceParanthesis;

import java.util.Stack;

public class BalanceParanthesisImpl implements BalanceParanthesis {
    public boolean checkBalanceParanthesis(String str) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(str.charAt(i)=='}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(str.charAt(i)==']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }else {
                stack.push(str.charAt(i));
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
