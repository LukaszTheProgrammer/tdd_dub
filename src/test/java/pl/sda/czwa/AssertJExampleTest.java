package pl.sda.czwa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Condition;
import org.junit.Test;

public class AssertJExampleTest {

    @Test
    public void showSomeAsserts() {
        String string = "str";
        assertThat(string).isNotNull();
        assertThat(string).isEqualTo("str");

        assertThat(string).isNot(new Condition<>((String s) -> s.startsWith("abc"), "starting with abc"))
            .isNotNull()
            .isExactlyInstanceOf(String.class);

        List<String> names = Arrays.asList("John", "Tim", "Ben");

        assertThat(names).contains("Tim")
            .doesNotContain("Bill");

        assertThat("John").isIn(names);

        assertThat(names).isEqualTo(Arrays.asList("John", "Tim", "Ben"));
    }
}
