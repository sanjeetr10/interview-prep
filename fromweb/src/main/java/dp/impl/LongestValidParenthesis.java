package dp.impl;

import java.util.Stack;

public class LongestValidParenthesis {

    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        st.push(-1);

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c==')'){
                st.pop();

                if(st.isEmpty()){
                    st.push(i);
                } else{
                   int len = i - st.peek();
                   max = Math.max(max,len);
                }
            } else{
                st.push(i);
            }
        }
        return max;
    }

}
