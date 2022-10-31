package triangle;

import triangle.Triangle;
import triangle.TriangleResult;

public class TriangleNSchmidt implements Triangle {

//    UNKNOWN, TRIANGLE_NOT_EQUAL = ungleich,
//    TRIANGLE_EQUILATERAL = gleichseitig,
//    TRIANGLE_ISOSCELES = gleichschenklig;

//    ungleiche Seiten: a!=b!=c
//    gleichschenkling: a=b!=c, a!=b=c, a=c!=b
//    gleichseitig: a=b=c


    @Override
    public TriangleResult getTriangleResultForLengths(int... lengths) {
        if (lengths == null || lengths.length == 0) {
            return TriangleResult.UNKNOWN;
        }

        Integer a = lengths[0];
        Integer b = lengths[1];
        Integer c = lengths[2];

        if (a instanceof Integer && b instanceof Integer && c instanceof Integer) {
            if (a < 0 || b < 0 || c < 0) {
                return TriangleResult.UNKNOWN;
            } else if (a == 0 || b == 0 || c == 0) {
                return TriangleResult.UNKNOWN;
            } else if (a == b && a == c && b == c) {
                return TriangleResult.TRIANGLE_EQUILATERAL;
            } else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)) {
                return TriangleResult.TRIANGLE_ISOSCELES;
            } else if (a != b && b != c && a != c) {
                return TriangleResult.TRIANGLE_NOT_EQUAL;
            }
        } else {
            return TriangleResult.UNKNOWN;
        }

        return TriangleResult.UNKNOWN;

    }
}
