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


public class CodexTest_0_9_3 { 
  @Test
    public void testScalarMultiply() {
        RandomGenerator random = new Well1024a(0xd0e7e4c6ed26d6d4l);
        for (int i = 0; i < 1000000; ++i) {
            double x = random.nextDouble();
            Vector1D v1 = new Vector1D(x);
            double a = random.nextDouble();
            Vector1D v2 = new Vector1D(a * x);
            Vector1D v3 = v1.scalarMultiply(a);
            Assert.assertEquals(0.0, v1.distance(v3), 1.0e-12);
            Assert.assertEquals(0.0, v2.distance(v3), 1.0e-12);
        }
    }
}