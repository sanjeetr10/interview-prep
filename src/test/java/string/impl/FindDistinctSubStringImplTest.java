package string.impl;

import org.junit.Test;
import string.FindDistinctSubString;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindDistinctSubStringImplTest {
    FindDistinctSubString findDistinctSubString = new FindDistinctSubStringImpl();

    @Test
    public void getAllDistinctSubString() {
       List<String> list = findDistinctSubString.getAllDistinctSubString("abbc");
       String[] expected = new String[]{"a","ab","b","b","bc","c"};
       assertArrayEquals(expected,list.toArray());
    }
}