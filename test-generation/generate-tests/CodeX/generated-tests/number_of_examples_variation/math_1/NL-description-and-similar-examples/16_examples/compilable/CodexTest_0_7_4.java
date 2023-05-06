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


public class CodexTest_0_7_4 { 
  @Test
    public void testScalarMultiply() {
        Vector1D u = new Vector1D(1.0);
        Vector1D v = new Vector1D(-2.0);
        Vector1D w = u.scalarMultiply(3.0);
        Assert.assertEquals(3.0, w.getX(), 1.0e-12);
        Assert.assertEquals(u.getX(), w.getX() / 3.0, 1.0e-12);
        Assert.assertEquals(u.getNorm(), w.getNorm() / 3.0, 1.0e-12);
        Assert.assertEquals(0.0, w.dotProduct(v), 1.0e-12);
    }
}