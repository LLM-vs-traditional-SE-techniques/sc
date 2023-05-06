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


public class CodexTest_0_9_10 { 
  @Test
    public void testMultiply() {
        doTestMultiply(new Vector1D(1.0, -2.0, 3.0), 2.0, new Vector1D(2.0, -4.0, 6.0));
    }
    public void testMultiply3x3x3() {
        doTestMultiply(new Vector3D(1.0, 2.0, 3.0), new Vector3D(1.0, 2.0, 3.0), new Vector3D(1.0, 4.0, 9.0));
    }
    private void doTestMultiply(Vector v1, double d, Vector expected) {
        final Vector v2 = v1.scalarMultiply(d);
        Assert.assertEquals(expected.getX(), v2.getX(), 0.0);
        Assert.assertEquals(expected.getY(), v2.getY(), 0.0);
        Assert.assertEquals(expected.getZ(), v2.getZ(), 0.0);
    }
}