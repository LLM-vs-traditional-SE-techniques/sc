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


public class CodexTest_0_7_10 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v1 = new Vector1D(0.0);
        Vector1D v2 = new Vector1D(3.5);
        Vector1D v3 = new Vector1D(4.0);
        Vector1D v4 = new Vector1D(-7.0);
        Assert.assertEquals(0.0, v1.scalarMultiply(3.0).getNorm(), 1.0e-12);
        Assert.assertEquals(v2.scalarMultiply(5.5), v3.scalarMultiply(-1.0).scalarMultiply(-1.0));
        Assert.assertEquals(v2.scalarMultiply(3.0), v3.scalarMultiply(2.0).add(v2));
        Assert.assertEquals(v3.scalarMultiply(-1.0), v4);
    }
}