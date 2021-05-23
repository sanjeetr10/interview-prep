package dp.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class LongestPalindromicStringTest {

    @Test
    public void longestPalindrome() {
        LongestPalindromicString s = new LongestPalindromicString();

        String s1 = "babad";
        assertThat(s.longestPalindrome(s1), anyOf(containsString("aba"), containsString("bab")));
//        assertEquals("aba", s.longestPalindrome(s1));

        s1 = "cbbd";
        assertEquals("bb", s.longestPalindrome(s1));

        s1 = "a";
        assertEquals("a", s.longestPalindrome(s1));

        s1 = "ac";
        assertEquals("a", s.longestPalindrome(s1));

        s1 = "aaaabbaa";
        assertEquals("aabbaa", s.longestPalindrome(s1));
    }
}