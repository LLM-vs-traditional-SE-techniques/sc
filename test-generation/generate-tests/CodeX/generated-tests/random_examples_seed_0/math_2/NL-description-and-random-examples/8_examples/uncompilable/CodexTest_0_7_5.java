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


public class CodexTest_0_7_5 { 
  @Test
    public void testDistanceSq() {
        assertEquals(0.0, Vector1D.distanceSq(Vector1D.PLUS_I, Vector1D.PLUS_I), 1.0e-10);
        assertEquals(0.0, Vector1D.distanceSq(Vector1D.MINUS_I, Vector1D.MINUS_I), 1.0e-10);
        assertEquals(2.0, Vector1D.distanceSq(Vector1D.PLUS_I, Vector1D.ZERO), 1.0e-10);
        assertEquals(2.0, Vector1D.distanceSq(Vector1D.MINUS_I, Vector1D.ZERO), 1.0e-10);
        assertEquals(2.0, Vector1D.distanceSq(Vector1D.ZERO, Vector1D.PLUS_I), 1.0e-10);
        assertEquals(2.0, Vector1D.distanceSq(Vector1D.ZERO, Vector1D.MINUS_I), 1.0e-10);
    }

}