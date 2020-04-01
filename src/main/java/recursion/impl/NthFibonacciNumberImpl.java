package recursion.impl;

import recursion.NthFibonacciNumber;

public class NthFibonacciNumberImpl implements NthFibonacciNumber {

    public int findNthFibonacciNumber(int n) {
        if(n==0)
            return 0 ;
        if(n==1)
            return 1;


        return findNthFibonacciNumber(n-1)+findNthFibonacciNumber(n-2);
    }
}
