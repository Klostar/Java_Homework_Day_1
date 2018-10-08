import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class calculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){

        assertEquals(4, calculator.add(2,2));
    }
    @Test
    public void canSubract(){
        assertEquals(1, calculator.subtract(3,2));
    }
    @Test
    public void canMultiply(){
        assertEquals(16, calculator.multiply(4,4));
    }
    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(21,7));
    }
}
