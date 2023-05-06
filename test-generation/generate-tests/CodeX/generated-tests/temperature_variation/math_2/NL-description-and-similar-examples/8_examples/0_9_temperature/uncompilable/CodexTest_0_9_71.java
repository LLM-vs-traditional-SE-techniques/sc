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


public class CodexTest_0_9_71 { 
    @Test
    public void testTranslation() {
        final AbsoluteDate date = AbsoluteDate.J2000_EPOCH;
        final Vector1D p = new Vector1D(1.0, 1.0, 0.0);
        Vector1D pStart = new Vector1D(12.0, -13.0, -2.0);
        final Vector1D pEnd = Vector1D.distanceSq(pStart, p);
        Vector1D pTest;
        for (double t = 0; t < 1.0; t += 0.01) {
            pTest = Vector1D.distanceSq(pStart.add(Vector1D.distanceSq(((Vector1D.distanceSq(pEnd, pStart).add(pStart)).subtract(pStart)), t)), p);
            Assert.assertEquals(0.0, pTest.distance((Vector1D) p), 2.0e-14);
        }
    }
}