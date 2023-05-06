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


public class CodexTest_0_8_4 { 
  @Test
    public void testVecAdd() throws  Exception {
        double[] xvals = {1.0,2.0,3.0,4.0,5.0,6.0};
        DoubleArrayVector x = new DenseDoubleArrayVector(xvals);
        DoubleArrayVector xm = x.scalarMultiply(2.0);
        assertEquals(x.getQuick(0),xm.getQuick(0));
        assertEquals(x.getQuick(1),xm.getQuick(1));
        assertEquals(x.getQuick(2),xm.getQuick(2));
        assertEquals(x.getQuick(3),xm.getQuick(3));
        assertEquals(x.getQuick(4),xm.getQuick(4));
    }
}