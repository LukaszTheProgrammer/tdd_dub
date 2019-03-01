package pl.sda.czwa;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedExample {

    @Test
    @Parameters({"17, false", "22, true" })
    public void parameterizedTest(int value, boolean expectedResult){

        assertEquals(isEven(value), expectedResult);
    }

    private boolean isEven(int value){
        return value % 2 == 0;
    }
}
