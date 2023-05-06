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


public class CodexTest_0_6_10 { 
  @Test
     public void testScalarMultiply() {
        Vector1D v1 = new Vector1D(1.0, 2.0, 3.0);
        Vector1D v2 = v1.scalarMultiply(2.0);
        Vector1D v3 = v1.scalarMultiply(3.0);
        Vector1D v4 = v1.scalarMultiply(4.0);
        Vector1D v5 = v1.scalarMultiply(5.0);
        Vector1D v6 = v1.scalarMultiply(6.0);
        Vector1D v7 = v1.scalarMultiply(7.0);
        Vector1D v8 = v1.scalarMultiply(8.0);
        Vector1D v9 = v1.scalarMultiply(9.0);
        Vector1D v10 = v1.scalarMultiply(10.0);
        assertEquals(1.0, v2.getX(), 1.0e-10);
        assertEquals(2.0, v3.getX(), 1.0e-10);
        assertEquals(3.0, v4.getX(), 1.0e-10);
        assertEquals(4.0, v5.getX(), 1.0e-10);
        assertEquals(5.0, v6.getX(), 1.0e-10);
        assertEquals(6.0, v7.getX(), 1.0e-10);
        assertEquals(7.0, v8.getX(), 1.0e-10);
        assertEquals(8.0, v9.getX(), 1.0e-10);
        assertEquals(9.0, v10.getX(), 1.0e-10);
    }
}