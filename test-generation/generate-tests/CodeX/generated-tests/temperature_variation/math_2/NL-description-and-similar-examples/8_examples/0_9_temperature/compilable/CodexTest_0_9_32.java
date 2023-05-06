import org.apache.commons.math3.geometry.euclidean.oned.*;
import java.text.NumberFormat;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Point;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_32 { 
  @Test
    public void testDistanceSq() {
        for (int x = -10; x < 10; ++x) {
            for (int y = -10; y < 10; ++y) {
                final Vector1D v1 = new Vector1D(x);
                final Vector1D v2 = new Vector1D(y);
                final double distanceSq = Vector1D.distanceSq(v1, v2);
                final double distance = Vector1D.distance(v1, v2);
                assertEquals(distanceSq, distance * distance, 1.0e-9);
                if (x != y) {
                    assertEquals(1.0, distanceSq / Vector1D.distanceSq(v2, v1), 1.0e-15);
                }
            }
        }
    }

}