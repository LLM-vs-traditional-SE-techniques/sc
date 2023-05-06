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


public class CodexTest_0_9_26 { 
  @Test
    public void testScalarMultiply() {
        Vector1D c = new Vector1D(2);
        Vector1D v = c.scalarMultiply(3);
        // check the same results are returned
        Vector1D w = v.scalarMultiply(3);
        Vector1D z = v.scalarMultiply(0.0);
        Assert.assertEquals(12.0, w.getNorm(), 1.0e-12);
        Assert.assertEquals(0.0, z.getNorm(), 1.0e-12);
    }
}