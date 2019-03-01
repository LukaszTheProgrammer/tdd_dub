package pl.sda.czwa;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionsWithRuleTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void test() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Error occured");

        run();
    }

    private void run() {
        throw new IllegalArgumentException("Error occured");
    }
}
