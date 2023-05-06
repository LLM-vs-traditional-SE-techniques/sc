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


public class CodexTest_0_8_10 { 
  @Test
    public void testScalarMultiplyDouble() {
		double[] tempArray = {1.2, 2.3, 3.4, 4.5};
		double[] expected = {0.6, 1.15, 1.7, 2.25};
		assertTrue("lengths should be equal.", tempArray.length == expected.length);
		for (int i = 0; i < tempArray.length; i++) {
			Vector1D v1 = new Vector1D(tempArray[i]);
			Vector1D v2 = new Vector1D(expected[i]);
			assertEquals("incorrect scalar multiplication.", v1.scalarMultiply(2.0), v2);
		}
	}
}