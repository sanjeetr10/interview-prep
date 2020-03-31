package recursion.impl;

import org.junit.Test;
import recursion.StringS1ToS2UsingRemoveInsertReplace;

import static org.junit.Assert.*;

public class StringS1ToS2UsingRemoveInsertReplaceImplTest {

    StringS1ToS2UsingRemoveInsertReplace stringS1ToS2UsingRemoveInsertReplace = new StringS1ToS2UsingRemoveInsertReplaceImpl();

    @Test
    public void findMinOperationToConvertS1ToS2UsingRemoveInsertReplace() {
        assertEquals(0, stringS1ToS2UsingRemoveInsertReplace.findMinOperationToConvertS1ToS2UsingRemoveInsertReplace("abc", "abc"));
        assertEquals(1, stringS1ToS2UsingRemoveInsertReplace.findMinOperationToConvertS1ToS2UsingRemoveInsertReplace("geek", "gesek"));
        assertEquals(1, stringS1ToS2UsingRemoveInsertReplace.findMinOperationToConvertS1ToS2UsingRemoveInsertReplace("cat", "cut"));
        assertEquals(3, stringS1ToS2UsingRemoveInsertReplace.findMinOperationToConvertS1ToS2UsingRemoveInsertReplace("sunday", "saturday"));
    }
}