package triangle;

import org.junit.jupiter.api.Test;
import triangle.Triangle;
import triangle.TriangleNSchmidt;
import triangle.TriangleResult;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleNSchmidtTest {

    public static final Triangle triangleNSchmidt = new TriangleNSchmidt();

    @Test
    public void testGetTriangleResultForLengthsNotEqual() {
        final int[] input = {5, 6, 7};
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsNotEqualVariables() {
        final int a = 5;
        final int b = 6;
        final int c = 7;
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsNotEqual2() {
        final int[] input = {50, 70, 90};
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsIsosceles() {
        final int[] input = {2, 2, 3};
        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsIsosceles2() {
        final int[] input = {50, 50, 80};
        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsEquiliteral() {
        final int[] input = {1, 1, 1};
        final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsEquiliteral2() {
        final int[] input = {42, 42, 42};
        final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultWithEmptyArray() {
        final int[] input = {};
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForValueIsZero() {
        final int[] input = {0, 42, 5};
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForNull() {
        final int[] input = null;
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForMinusValues() {
        final int[] input = {-10, -42, 5};
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangleNSchmidt.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }
}
