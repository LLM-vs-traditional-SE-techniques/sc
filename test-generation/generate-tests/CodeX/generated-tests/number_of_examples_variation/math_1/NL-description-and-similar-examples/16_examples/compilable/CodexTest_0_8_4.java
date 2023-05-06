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


public class CodexTest_0_8_4 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(1);
        Assert.assertEquals(v.scalarMultiply(0.0).getNorm(), 0.0, 1.0e-12);
        Assert.assertEquals(v.scalarMultiply(2).getNorm(), 2, 1.0e-12);
        Assert.assertEquals(v.scalarMultiply(Math.PI).getNorm(), Math.PI, 1.0e-12);
        Assert.assertEquals(v.scalarMultiply(Math.E).getNorm(), Math.E, 1.0e-12);
    }
}