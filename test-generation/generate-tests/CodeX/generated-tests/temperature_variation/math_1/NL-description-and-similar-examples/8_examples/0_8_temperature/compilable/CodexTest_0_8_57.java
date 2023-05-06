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


public class CodexTest_0_8_57 { 
  @Test
    public void testScalarAddMultiply() {
        Vector1D v1 = new Vector1D(0);
        Vector1D v2 = new Vector1D(1);
        Vector1D v3 = v1.subtract(v2);
        v2 = v2.subtract(v1);
        v1 = v1.subtract(v3);
        Assert.assertEquals(0.0, v1.scalarMultiply(42).getNorm(), 1.0e-12);
        Assert.assertEquals(0.0, v2.scalarMultiply(42).getNorm(), 1.0e-12);
        Assert.assertEquals(0.0, v3.scalarMultiply(42).getNorm(), 1.0e-12);
    }
}