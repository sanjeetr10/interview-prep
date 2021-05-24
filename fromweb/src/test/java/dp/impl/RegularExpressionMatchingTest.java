package dp.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {

    @Test
    public void match() {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();

        String s = "aa";
        String p = "a";
        assertFalse(regularExpressionMatching.match(s,p));

        s= "aa";
        p="a*";
        assertTrue(regularExpressionMatching.match(s,p));

        s= "ab";
        p=".*";
        assertTrue(regularExpressionMatching.match(s,p));

        s= "aab";
        p="c*a*b";
        assertTrue(regularExpressionMatching.match(s,p));

        s= "aa";
        p="a*";
        assertTrue(regularExpressionMatching.match(s,p));

        s= "mississippi";
        p="mis*is*p*.";
        assertFalse(regularExpressionMatching.match(s,p));
    }
}