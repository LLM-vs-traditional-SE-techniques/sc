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
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(2);
        Assert.assertEquals(0.0, v1.scalarMultiply(0.0).getNorm(), 0);
        Assert.assertEquals(v2.getNorm(), v1.scalarMultiply(2).getNorm(), 1.0e-12);
        Assert.assertEquals(v1.add(v2).getNorm(), v1.scalarMultiply(3).getNorm(), 1.0e-12);
    }
}