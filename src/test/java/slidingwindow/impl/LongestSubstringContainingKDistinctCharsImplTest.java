package slidingwindow.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringContainingKDistinctCharsImplTest {

    LongestSubstringContainingKDistinctCharsImpl longestSubstringContainingKDistinctChars = new LongestSubstringContainingKDistinctCharsImpl();

    @Test
    public void findSubString() {
        String input = "abcbdbdbbdcdabd";
        String fst = longestSubstringContainingKDistinctChars.findSubString(input,2);
        String scnd = longestSubstringContainingKDistinctChars.findSubString(input,3);
        String third = longestSubstringContainingKDistinctChars.findSubString(input,5);

        assertEquals("bdbdbbd",fst);
        assertEquals("bcbdbdbbdcd",scnd);
        assertEquals("abcbdbdbbdcdabd",third);
    }
}