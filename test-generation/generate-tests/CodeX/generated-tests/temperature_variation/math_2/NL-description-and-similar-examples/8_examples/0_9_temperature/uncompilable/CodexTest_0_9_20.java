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


public class CodexTest_0_9_20 { 
  @Test
    public void testDistance() {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(-4);
        Assert.assertEquals(0.0, Vector1D.distance(new Vector1D(-1), new Vector1D(-1)), 0);
        Assert.assertEquals(5.0, Vector1D.distance(v1, v2), 1.0e-12);
        Assert.assertEquals(v1.subtract(v2).getNorm(), Vector1D.distance(v1, v2), 1.0e-12);
    }
        public void testGetNorm() {
        Vector1D v = new Vector1D(5);
        Assert.assertEquals(1.0, v.getNorm1() - 5, 1.0e-12);
        Assert.assertEquals(1.0, v.getNorm2() - 5, 1.0e-15);
        Assert.assertEquals(1.0, v.getNormInf() - 5, 1.0e-12);
    }
    public void testBuild() {
        Vector1D v1 = new Vector1D(3);
        Vector1D v2 = v1.build(Double.valueOf(43));
        Assert.assertEquals(43, v2.getX(), 2.0e-12);
    }

}