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


public class CodexTest_0_5_1 { 
  @Test
    public void testScalarMultiply() {
        Vector1D p1 = new Vector1D(1);
        Vector1D p2 = new Vector1D(-4);
        Assert.assertEquals(new Vector1D(0), p1.scalarMultiply(0));
        Assert.assertEquals(new Vector1D(10), p1.scalarMultiply(10));
        Assert.assertEquals(new Vector1D(4), p2.scalarMultiply(-1));
        Assert.assertEquals(new Vector1D(-5), p2.scalarMultiply(5.0 / 4));
        Assert.assertEquals(new Vector1D(0), p2.scalarMultiply(0));
    }

}