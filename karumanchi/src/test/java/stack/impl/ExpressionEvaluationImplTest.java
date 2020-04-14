package stack.impl;

import org.junit.Test;
import stack.ExpressionEvaluation;

import static org.junit.Assert.*;

public class ExpressionEvaluationImplTest {

    @Test
    public void evaluate() {

        ExpressionEvaluation expressionEvaluation = new ExpressionEvaluationImpl();

        String[] str = new String[]{"1","2","3","*","+","5","-"};
        
        assertEquals(2, expressionEvaluation.evaluate(str));
    }
}