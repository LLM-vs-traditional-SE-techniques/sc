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


public class CodexTest_0_7_84 { 
  @Test
    public void testScalarMultiply ()
    {
        double[] vector = {-2.0, 1.0};
        double[] vectorResult = {-4.0, 2.0};
        double scalar = 2.0;
        assertArrayEquals(vectorResult, Vector1D.scalarMultiply(scalar, vector));
        vector = new double[] {-2.0, 1.0};
        vectorResult = new double[] {-8.0, 4.0};
        scalar = 4.0;
        assertArrayEquals(vectorResult, Vector1D.scalarMultiply(scalar, vector));
        vector = new double[] {-2.0, 1.0};
        vectorResult = new double[] {-0.5, 0.25};
        scalar = 0.25;
        assertArrayEquals(vectorResult, Vector1D.scalarMultiply(scalar, vector));
        vector = new double[] {3.0, -4.0};
        vectorResult = new double[] {1.5, -2.0};
        scalar = 0.5;
        assertArrayEquals(vectorResult, Vector1D.scalarMultiply(scalar, vector));
        vector = new double[] {-5.5, 3.5};
        vectorResult = new double[] {-2.75, 1.75};
        scalar = 0.5;
        assertArrayEquals(vectorResult, Vector1D.scalarMultiply(scalar, vector));
        vector = new double[] {2.5, 3.5};
        vectorResult = new double[] {-2.5, -3.5};
        scalar = -1.0;
        assertArrayEquals(vectorResult, Vector1D.scalarMultiply(scalar, vector));
        vector = new double[] {-2.0, 1.0};
        vectorResult = new double[] {0.0, 0.0};
        scalar = 0.0;
        assertArrayEquals(vectorResult, Vector1D.scalar
}