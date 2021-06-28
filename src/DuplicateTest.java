
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;


public class DuplicateTest {

    Duplicate builder = new Duplicate();

    @Test
    public void givenAString_whenOneDuplicate_printCountTwo() {
        Map<Character, Integer> result = builder.countDuplicate("bob");

        assertThat(result.get('b'), is(2));
    }

    @Test
    public void givenAString_whenTwoDuplicate_printCountThree() {
        Map<Character, Integer> result = builder.countDuplicate("bobb");

        assertThat(result.get('b'), is(3));
    }

    @Test
    public void givenString_whenNoDuplicate_returnNull() {
        Map<Character, Integer> result = builder.countDuplicate("Copy");

        assertThat(result.get('t'), nullValue());
    }


}
