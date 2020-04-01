package stack.impl;

import org.junit.Test;
import stack.BalanceParanthesis;

import static org.junit.Assert.*;

public class BalanceParanthesisImplTest {

    BalanceParanthesis balanceParanthesis = new BalanceParanthesisImpl();

    @Test
    public void checkBalanceParanthesis() {
        assertTrue(balanceParanthesis.checkBalanceParanthesis("(){}[]"));
        assertFalse(balanceParanthesis.checkBalanceParanthesis("({}[]"));
    }
}