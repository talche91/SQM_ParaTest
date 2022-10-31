import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTest {


    public static int[][] data() {
        return new int[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource(value =  "data")
    void testWithStringParameter(int[] data) {
        Multiply tester = new Multiply();
        int m1 = data[0];
        int m2 = data[1];
        int expected = data[2];
        assertEquals(expected, tester.multiply(m1, m2));
    }

}
