package stack.impl;

import org.junit.Test;
import stack.BalancedSymbols;

import static org.junit.Assert.*;

public class BalancedSymbolsImplTest {

    @Test
    public void checkForBalanced() {

        BalancedSymbols balancedSymbols = new BalancedSymbolsImpl();

        assertTrue(balancedSymbols.checkForBalanced("{}()[][[]]{([])}"));
    }

    @Test
    public void checkForUnBalanced(){
        BalancedSymbols balancedSymbols = new BalancedSymbolsImpl();
        assertFalse(balancedSymbols.checkForBalanced("{}()[][[]]{([}])}"));
    }
}