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


public class CodexTest_0_8_17 { 
  @Test
     public void testNormSq() {
            Vector1D v = new Vector1D(-3.4);
            Assert.assertTrue(FastMath.abs(Vector1D.distanceSq(v, v) - 11.56) < 1.0e-8);
            Assert.assertTrue(FastMath.abs(Vector1D.distanceSq(new Vector1D(1), new Vector1D(0)) - 1) < 1.0e-8);
            Assert.assertTrue(FastMath.abs(Vector1D.distanceSq(new Vector1D(1), new Vector1D(-1)) - 4) < 1.0e-8);
     }
}