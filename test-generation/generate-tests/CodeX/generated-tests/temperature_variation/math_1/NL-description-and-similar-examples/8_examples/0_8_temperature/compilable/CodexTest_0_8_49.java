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


public class CodexTest_0_8_49 { 
  @Test
    public static void testDivide() {
        Vector1D zero = new Vector1D(0.0);
        Assert.assertEquals(zero, zero.scalarMultiply(0.0));
        Vector1D two = new Vector1D(2.0);
        Assert.assertEquals(new Vector1D(0.0), two.scalarMultiply(0.0));
        Assert.assertEquals(two, zero.scalarMultiply(0.0).add(two));
        Assert.assertEquals(new Vector1D(4.0), two.scalarMultiply(2.0));
    }

}