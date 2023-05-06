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


public class CodexTest_0_9_78 { 
    @Test(expected=java.lang.ArithmeticException.class)
    public void testScalarMultiplyException() {
        Matrix2D m = new Matrix2D(
                1.0, 2.0,
                5.0, 4.0
        );
        Vector2D u = new Vector2D(1.0, 2.0);
        u = u.scalarMultiply(-2.0);
        m.scalarMultiplyInPlace(-1.0);
        Assert.assertArrayEquals(new double[] {1.0,-2.0,5.0,-4.0}, m.toArray(), 80.0);
    }
}