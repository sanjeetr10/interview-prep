package stack.impl;

import stack.BalanceParanthesis;

import java.util.Stack;

public class BalanceParanthesisImpl implements BalanceParanthesis {
    public boolean checkBalanceParanthesis(String str) {
        Stack<Character> stk = new Stack<Character>();
        if(str.length()== 0 || str==null){
            return false;
        }
        int n = str.length();
        for(int i = 0 ; i<n ; i++){
            if(str.charAt(i)==')'){
                if(!stk.isEmpty() && stk.peek()=='(')
                    stk.pop();
                else {
                    return false;
                }
            }
           else if(str.charAt(i) ==']'){
               if((!stk.isEmpty() && stk.peek()=='['))
                   stk.pop();
               else {
                   return false;
               }
            }
            else if(str.charAt(i) =='}'){
                if((!stk.isEmpty() && stk.peek()=='{'))
                    stk.pop();
                else {
                    return false;
                }
            }
            else{
                stk.push(str.charAt(i));
            }
        }
        if(stk.isEmpty())
        return true;
        else {
            return false;
        }
    }
}
