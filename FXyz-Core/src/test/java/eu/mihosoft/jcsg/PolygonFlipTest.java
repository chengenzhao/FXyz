package eu.mihosoft.jcsg;

import eu.mihosoft.vvecmath.Vector3d;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PolygonFlipTest {

    private static final double EPSILON = 1e-8;

    @Test
    public void flipPolygonTest() {
        Polygon polygon = Polygon.fromPoints(
                Vector3d.xy(1, 1),
                Vector3d.xy(2, 1),
                Vector3d.xy(1, 2)
        );
        assertEquals(Vector3d.z(1), polygon.getPlane().getNormal());
        polygon.flip();
        assertEquals(Vector3d.z(-1), polygon.getPlane().getNormal());
    }

    private void assertEquals(final Vector3d expected, final Vector3d actual) {
        Assertions.assertEquals(expected.getX(), actual.getX(), EPSILON);
        Assertions.assertEquals(expected.getY(), actual.getY(), EPSILON);
        Assertions.assertEquals(expected.getZ(), actual.getZ(), EPSILON);
    }
}
