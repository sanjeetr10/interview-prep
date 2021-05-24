package dp.impl;

import static org.junit.Assert.*;

public class LongestValidParenthesisTest {

    public void testLongestValidParenthesis(){
        LongestValidParenthesis parenthesis = new LongestValidParenthesis();

        String s1 = "(()";
        assertEquals(2, parenthesis.longestValidParentheses(s1));

        s1=")()())";
        assertEquals(4, parenthesis.longestValidParentheses(s1));

        s1="";
        assertEquals(0, parenthesis.longestValidParentheses(s1));
    }
}