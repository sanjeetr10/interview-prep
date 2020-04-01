package recursion.impl;

import recursion.StringS1ToS2UsingRemoveInsertReplace;

public class StringS1ToS2UsingRemoveInsertReplaceImpl implements StringS1ToS2UsingRemoveInsertReplace {

    public int findMinOperationToConvertS1ToS2UsingRemoveInsertReplace(String s1, String s2, int m, int n) {

        if(m==0){
            return n;
        }

        if(n==0){
            return m;
        }

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return findMinOperationToConvertS1ToS2UsingRemoveInsertReplace(s1,s2,m-1,n-1);
        }

        return 1 + findMin(findMinOperationToConvertS1ToS2UsingRemoveInsertReplace(s1,s2,m,n-1), //inisert
                            findMinOperationToConvertS1ToS2UsingRemoveInsertReplace(s1,s2,m-1,n-1), //replace
                            findMinOperationToConvertS1ToS2UsingRemoveInsertReplace(s1,s2,m-1,n)); // remove
    }

    public int findMin(int x,int y,int z){
        return Math.min(x,Math.min(y,z));
    }
}
