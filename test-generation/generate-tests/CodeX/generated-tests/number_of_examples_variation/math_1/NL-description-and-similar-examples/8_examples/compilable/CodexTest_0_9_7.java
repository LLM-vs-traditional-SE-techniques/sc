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


public class CodexTest_0_9_7 { 
  @Test
    public void testCreate() {
        Vector1D v1 = new Vector1D(0.0);
		Vector1D v1D = new Vector1D(0);
		Vector1D v2 = new Vector1D(-14.0);
		Vector1D v2D = new Vector1D(-14);
		Vector1D v3 = new Vector1D(7.0);
		Vector1D v3D = new Vector1D(7);
		Assert.assertEquals(0.0, v1.getNorm(), 1.0e-12);
		Assert.assertEquals(1.0, v2.scalarMultiply(-0.14285714285714285).getNorm(), 1.0e-12);
		Assert.assertEquals(7.0, v3.getNorm(), 1.0e-12);
		Assert.assertEquals(v1, v1D);
		Assert.assertEquals(v2, v2D);
		Assert.assertEquals(v3, v3D);
	}

}