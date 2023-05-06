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


public class CodexTest_0_8_2 { 
  @Test
    public void testScalarMultiply() {
        final double a = 0.5;
        Vector1D u = new Vector1D(1.1, 2.2, 3.3);
        Vector1D v = new Vector1D(2.0, 4.0, 6.0);
        Assert.assertEquals(v, u.scalarMultiply(a).scalarMultiply(1 / a));
        Assert.assertEquals(v, u.scalarMultiply(2 * a).scalarMultiply(1 / (2 * a)));
        for (int i = 1; i < 10; ++i) {
            final double ai = a * i;
            final Vector1D vi = u.scalarMultiply(ai);
            Assert.assertEquals(vi, vi.scalarMultiply(1.0 / ai));
        }
    }
}