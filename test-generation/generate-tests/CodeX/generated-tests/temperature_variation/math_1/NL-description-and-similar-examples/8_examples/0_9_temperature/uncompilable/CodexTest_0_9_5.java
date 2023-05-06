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


public class CodexTest_0_9_5 { 
  @Test
    public void testScalarMultiply() {
		Vector1D v1 = new Vector1D(1);
		Vector1D v2 = new Vector1D(-1);
		Assert.assertSame(Vector1D.NaN, v1.scalarMultiply(Double.NaN));
		Assert.assertEquals(Vector1D.NEGATIVE_INFINITY, v1.scalarMultiply(Double.NEGATIVE_INFINITY));
		Assert.assertEquals(Vector1D.POSITIVE_INFINITY, v1.scalarMultiply(Double.POSITIVE_INFINITY));
		Assert.assertEquals(Vector1D.POSITIVE_INFINITY, v2.scalarMultiply(Double.NEGATIVE_INFINITY));
		Assert.assertEquals(Vector1D.NEGATIVE_INFINITY, v2.scalarMultiply(Double.POSITIVE_INFINITY));
}