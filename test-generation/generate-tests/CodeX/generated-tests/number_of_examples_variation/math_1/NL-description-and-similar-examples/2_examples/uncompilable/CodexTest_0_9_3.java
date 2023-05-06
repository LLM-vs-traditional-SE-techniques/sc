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


public class CodexTest_0_9_3 { 
  @Test
    public void testScalarMultiply() {
		Vector1D v1 = new Vector1D(3);
		Vector1D v2 = new Vector1D(5);
		Vector1D v3 = v2.scalarMultiply(2.0);
		Vector1D v4 = v3.scalarMultiply(-0.1);
		Assert.assertEquals(1,  v2.scalarMultiply(0.5).getNorm(), 1.0e12);
		Assert.assertEquals(2,  v2.scalarMultiply(2).getNorm(), 1.0e12);
		Assert.assertEquals(3,  v3.getNorm(), 1.0e12);
		Assert.assertEquals(0.5, v4.getNorm(), 1.0e12);
	}
*/
}