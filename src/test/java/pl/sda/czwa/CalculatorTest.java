package pl.sda.czwa;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoNumbers() {
        //when
        int result = calculator.add(4, 3);

        //then
        assertEquals(7, result);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //when
        int result = calculator.subtract(10, 2);

        //then
        assertEquals(8, result);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        //when
        int result = calculator.multiply(4, 5);

        //then
        assertEquals(20, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotDivideByZero() {
        calculator.divide(10, 0);
    }

}
