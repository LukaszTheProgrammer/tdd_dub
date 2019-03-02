package pl.sda.czwa;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class VowelCheckerTest {

    @Test
    @Parameters({"a, true", "b, false", "#,false", "®,false"})
    public void test(char c, boolean expectedResult){
        //when
        boolean isVowel = VowelChecker.isVowel(c);

        //then
        assertEquals(isVowel, expectedResult);
    }
}