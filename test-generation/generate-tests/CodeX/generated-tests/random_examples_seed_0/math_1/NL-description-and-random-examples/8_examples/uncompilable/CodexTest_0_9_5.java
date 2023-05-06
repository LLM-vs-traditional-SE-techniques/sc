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
    public void testMultiplyWithScale() {
    		    Vector1D u = new Vector1D(1, 2, 3);
    		    Vector1D v = new Vector1D(2, 3, 4);
    		    assertEquals(new Vector1D(0,0,0), u.scalarMultiply(0));
    		    assertEquals(new Vector1D(0,0,0), v.scalarMultiply(0));
    		    assertEquals(u, u.scalarMultiply(1));
    		    assertEquals(v, v.scalarMultiply(1));
    		    assertEquals(new Vector1D(2, 4, 6), u.scalarMultiply(2));
    		    assertEquals(new Vector1D(4, 6, 8), v.scalarMultiply(2));
    		}
}