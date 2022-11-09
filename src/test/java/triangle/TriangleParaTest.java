package triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import triangle.TriangleNSchmidt;
import triangle.TriangleResult;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriangleParaTest {

    private static Stream<Arguments> provideLengths() {
        return Stream.of(
                Arguments.of(new int[]{5, 7, 6}, TriangleResult.TRIANGLE_NOT_EQUAL),
                Arguments.of(new int[]{2, 2, 3}, TriangleResult.TRIANGLE_ISOSCELES),
                Arguments.of(new int[]{1, 1, 1}, TriangleResult.TRIANGLE_EQUILATERAL),
                Arguments.of(new int[]{}, TriangleResult.UNKNOWN),
                Arguments.of(new int[]{0,42,5}, TriangleResult.UNKNOWN),
                Arguments.of(null, TriangleResult.UNKNOWN),
                Arguments.of(new int[]{-10,-42,5}, TriangleResult.UNKNOWN)
        );
    }

    @DisplayName("A parametrerized Test for Triangle")
    @ParameterizedTest(name = "Values: {0}, Expected: {1}")
    @MethodSource(value = "provideLengths")
    public void testTriangle(int[] a, TriangleResult res) {
        TriangleNSchmidt triangleNSchmidt = new TriangleNSchmidt();
        TriangleResult result =triangleNSchmidt.getTriangleResultForLengths(a);
        assertThat(result).isEqualTo(res);
    }


}







