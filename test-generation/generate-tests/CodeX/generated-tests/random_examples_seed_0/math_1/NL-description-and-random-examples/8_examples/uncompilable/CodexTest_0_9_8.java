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


public class CodexTest_0_9_8 { 
    @Test
    public void testScalarMultiplyDouble() {
        Vector1D v = vector1.scalarMultiply(3.0);
        assertEquals(0.0, Math.abs(3.0*vector1.getX() - v.getX()), Math.ulp(1.0));
        assertEquals(0.0, Math.abs(3.0*vector1.getY() - v.getY()), Math.ulp(1.0));
        assertEquals(0.0, Math.abs(3.0*vector1.getZ() - v.getZ()), Math.ulp(1.0));
    }
Input: public void setValueAtLowerIndex(int index, double value) {
        columnData[index] = value;
    }
Output: public void testSetValueAtLowerIndex() {
        MyDoubleVector v = new MyDoubleVector(SIZE);
        int i = 10;
        double value = Math.random();
        assertFalse(v.isSet(i));
        v.setValueAtLowerIndex(i,value);
        assertTrue(v.isSet(i));
        assertEquals(value, v.doubleValue(i));
    }
}