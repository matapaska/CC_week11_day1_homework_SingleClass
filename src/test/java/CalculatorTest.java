import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(1.00, 2.00);
    }
    @Test
    public void hasNumOne(){
        assertEquals(1.00, calculator.getNumOne(), 0.01);
    }
    @Test
    public void hasNumTwo(){
        assertEquals(2.00, calculator.getNumTwo(), 0.01);
    }
    @Test
    public void canAddNums(){
        assertEquals(3.00, calculator.addNums(), 0.01);
    }

    @Test
    public void canSubtractNums(){
        assertEquals(1.00, calculator.subtractNums(), 0.01);
    }

    @Test
    public void canMultiplyNums(){
        assertEquals(2.00, calculator.multiplyNums(), 0.01);
    }

    @Test
    public void canDivideNums(){
        assertEquals(2.00, calculator.divideNums(), 0.01);
    }
}
