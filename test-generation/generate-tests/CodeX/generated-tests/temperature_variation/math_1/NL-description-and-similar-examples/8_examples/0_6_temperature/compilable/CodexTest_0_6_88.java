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


public class CodexTest_0_6_88 { 
  @Test
    public void testScalarMultiply() {
        Vector1D p1 = new Vector1D(1);
        Vector1D p2 = new Vector1D(-4);
        Vector1D p3 = new Vector1D(0.5);
        Assert.assertEquals(0.0, p3.scalarMultiply(0).getNorm(), 1.0e-10);
        Assert.assertEquals(p1, p1.scalarMultiply(1.0));
        Assert.assertEquals(p2, p2.scalarMultiply(1.0));
        Assert.assertEquals(p1.add(p2), p1.scalarMultiply(1).add(p2.scalarMultiply(1)));
        Assert.assertEquals(p1.subtract(p2), p1.scalarMultiply(1).subtract(p2.scalarMultiply(1)));
        Assert.assertEquals(p1.distance(p2), p1.scalarMultiply(1).distance(p2.scalarMultiply(1)), 1.0e-10);
    }
}