import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputeFactorsParaTest {

    private static Stream<Arguments> provideParaForComputeFactors() {
        return Stream.of(
                Arguments.of(3, Arrays.asList(1L, 3L)),
                Arguments.of(42, Arrays.asList(1L, 2L, 3L, 6L, 7L, 14L, 21L, 42L)),
                Arguments.of(-42, Arrays.asList())
        );
    }

    @ParameterizedTest
    @MethodSource(value = "provideParaForComputeFactors")
    public void testComputeFactors(long number, List<Long> expectedArray) {
        ComputeFactors factors = new ComputeFactors(number);
        factors.computeFactor();
        assertThat(factors.getFactors()).isEqualTo(expectedArray);
    }

}

