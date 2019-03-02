package pl.sda.czwa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class NameAggregatorTest {

    @Test
    public void test(){
        //given
        List<String> names = Arrays.asList("Ania", "Adam",
            "Tomek", "Marcin", "Michał");

        //when
        Map<Character, List<String>> namesByStartingLetter =
            NameAggregator.aggregate(names);

        //then
        assertThat(namesByStartingLetter.get('A'))
            .contains("Ania", "Adam");

        assertThat(namesByStartingLetter.get('T'))
            .contains("Tomek");

        assertThat(namesByStartingLetter.get('M'))
            .contains("Marcin", "Michał");

    }
}
