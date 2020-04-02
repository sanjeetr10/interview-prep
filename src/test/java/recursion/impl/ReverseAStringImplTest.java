package recursion.impl;

import org.junit.Test;
import recursion.ReverseAString;

import static org.junit.Assert.*;

public class ReverseAStringImplTest {

    ReverseAString reverseAString = new ReverseAStringImpl();

    @Test
    public void reverse() {

        assertEquals("abc",reverseAString.reverse("cba"));
        assertEquals("",reverseAString.reverse(""));
    }
}