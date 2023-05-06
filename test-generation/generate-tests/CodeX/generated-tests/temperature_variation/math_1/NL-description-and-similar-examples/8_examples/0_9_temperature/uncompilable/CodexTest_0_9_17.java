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


public class CodexTest_0_9_17 { 
  @Test
    public static void Vector1D_scalarMultiplyTest0() {
        Vector1D o_scalarMultiplyTest0__1 = new Vector1D(0.0);
        Assert.assertEquals(0.0, ((Vector1D) (o_scalarMultiplyTest0__1)).x, 0.01);
        Assert.assertFalse(((Vector1D) (o_scalarMultiplyTest0__1)).isNaN());
        Vector1D o_scalarMultiplyTest0__3 = new Vector1D(1.0);
        Assert.assertEquals(1.0, ((Vector1D) (o_scalarMultiplyTest0__3)).x, 0.01);
        Assert.assertFalse(((Vector1D) (o_scalarMultiplyTest0__3)).isNaN());
        Vector1D o_scalarMultiplyTest0__5 = o_scalarMultiplyTest0__1.scalarMultiply(0.5);
        Assert.assertEquals(0.0, ((Vector1D) (o_scalarMultiplyTest0__5)).x, 0.01);
        Assert.assertFalse(((Vector1D) (o_scalarMultiplyTest0__5)).isNaN());
        Assert.assertEquals(0.0, ((Vector1D) (o_scalarMultiplyTest0__1)).x, 0.01);
        Assert.assertFalse(((Vector1D) (o_scalarMultiplyTest0__1)).isNaN());
        Assert.assertEquals(1.0, ((Vector1D) (o_scalarMultiplyTest0__3)).x, 0.01);
        Assert.assertFalse(((Vector1D) (o_scalarMultiplyTest0__3)).isNaN());
    }
}