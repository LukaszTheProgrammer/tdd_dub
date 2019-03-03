package pl.sda.czwa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FirstTest {

    @Test
    public void theVeryFirstTest() {
        int a = 2;
        int b = 3;
        int c = a * b;
        assertEquals(c, 6);

        List<Integer> ints = Arrays.asList(1, 2, 3);
        assertNotNull(ints);
        assertEquals(ints, Arrays.asList(1, 2, 3));
    }
}
