import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import triangle.SimpleMethodToTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleMethodTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void testLowerThanFour(int argument) {
        assertTrue(SimpleMethodToTest.isLowerThanFour(argument));
    }

}
