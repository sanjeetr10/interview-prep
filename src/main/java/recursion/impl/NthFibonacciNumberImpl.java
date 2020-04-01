package recursion.impl;

import recursion.NthFibonacciNumber;

public class NthFibonacciNumberImpl implements NthFibonacciNumber {

    public int findNthFibonacciNumber(int n) {

        if(n==0 || n==1){
            return n;
        }

        return findNthFibonacciNumber(n-1) + findNthFibonacciNumber(n-2);
    }
}
