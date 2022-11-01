package dreamCar;

import dreamCar.DreamCarWithoutBug;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class DreamCarParaTest {

    private static Stream<Arguments> provideParaForDreamCar() {
        return Stream.of(
                Arguments.of((Object) new double[] {20000.00, 3450.00, 6000.00, 1, 10.00}, 27450.0),
                Arguments.of((Object) new double[] {20000.00, 3450.00, 6000.00, 20, 10.00}, 26550.0),
                Arguments.of((Object) new double[] {0.0, 0.0, 0.0, 0, 0}, 0.0),
                Arguments.of((Object) new double[] {0.01, 0.01, 0.01, 2, 0.1}, 0.3)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "provideParaForDreamCar")
    public void testDreamCar(double[] parameter, double expected) {
        DreamCarWithoutBug dc = new DreamCarWithoutBug( parameter[0], parameter[1], parameter[2], (int) parameter[3], parameter[4]);
        double res = dc.calculatePrice();
        assertThat(res).isEqualTo(expected);
    }





//
//    //    notvalid
//    @Test
//    public void testCalculatePrice5() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(Double.parseDouble("abc"), 3450.00, 6000.00, 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    @Test
//    public void testCalculatePrice6() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, -1.0, 6000.0, 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    //    notvalid
//    @Test
//    public void testCalculatePrice7() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, Double.parseDouble("abc"), 6000.0, 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    @Test
//    public void testCalculatePrice8() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, 3450.0, -1.0, 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    //    notvalid
//    @Test
//    public void testCalculatePrice9() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, 3450.0, Double.parseDouble("abc"), 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    //    notvalid
//    @Test
//    public void testCalculatePrice10() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, 3450.0, 6000.0, -1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    @Test
//    public void testCalculatePrice11() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, 3450.0, 6000.0, Integer.parseInt("abc"), 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    @Test
//    public void testCalculatePrice12() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, 3450.0, 6000.0, 1, -1.0);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    @Test
//    public void testCalculatePrice13() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, 3450.0, 6000.0, 1, 101.0);
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    //    notvalid
//    @Test
//    public void testCalculatePrice14() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.0, 3450.0, 6000.0, 1, Double.parseDouble("abc"));
//        double result = dc.calculatePrice();
//        assertThat(result).isNaN();
//    }
//
//    @Test
//    public void testCalculatePrice15() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(0.0, 0.0, 0.0, 0, 0);
//        double result = dc.calculatePrice();
//        double expected = 0.0;
//        assertThat(result).isEqualTo(expected);
//    }
//
//    @Test
//    public void testCalculatePrice16() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(0.01, 0.01, 0.01, 2, 0.1);
//        double result = dc.calculatePrice();
//        double expected = 0.03;
//        assertThat(result).isCloseTo(expected, within(0.01));
//    }
//
//    @Test
//    public void testCalculatePrice17() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(Double.MAX_VALUE - 0.01, Double.MAX_VALUE - 0.01, Double.MAX_VALUE - 0.01, 4, 99.99);
//        double result = dc.calculatePrice();
//        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
//    }
//
//    @Test
//    public void testCalculatePrice18() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(Double.MAX_VALUE - 0.01, 3450.0, 6000.0, 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
//    }
//
//    @Test
//    public void testCalculatePrice19() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.00, Double.MAX_VALUE - 0.01, 6000.0, 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
//    }
//
//    @Test
//    public void testCalculatePrice20() {
//        dreamCar.DreamCarWithoutBug dc = new dreamCar.DreamCarWithoutBug(20000.00, 3450.0, Double.MAX_VALUE - 0.01, 1, 10.00);
//        double result = dc.calculatePrice();
//        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
//    }

}
