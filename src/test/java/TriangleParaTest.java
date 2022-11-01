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
                Arguments.of((Object) new int[]{5, 7, 6}, TriangleResult.TRIANGLE_NOT_EQUAL),
                Arguments.of((Object) new int[]{2, 2, 3}, TriangleResult.TRIANGLE_ISOSCELES),
                Arguments.of((Object) new int[]{1, 1, 1}, TriangleResult.TRIANGLE_EQUILATERAL),
                Arguments.of((Object) new int[]{}, TriangleResult.UNKNOWN),
                Arguments.of((Object) new int[]{0,42,5}, TriangleResult.UNKNOWN),
                Arguments.of((Object) null, TriangleResult.UNKNOWN),
                Arguments.of((Object) new int[]{-10,-42,5}, TriangleResult.UNKNOWN)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "provideLengths")
    public void testTriangle(int[] a, TriangleResult res) {
        TriangleNSchmidt triangleNSchmidt = new TriangleNSchmidt();
        TriangleResult result =triangleNSchmidt.getTriangleResultForLengths(a);
        assertThat(result).isEqualTo(res);
    }


}







