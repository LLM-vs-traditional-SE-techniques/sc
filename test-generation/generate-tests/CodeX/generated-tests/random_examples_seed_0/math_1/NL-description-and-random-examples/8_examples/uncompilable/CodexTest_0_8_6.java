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


public class CodexTest_0_8_6 { 
    /**
     * Suggest a test for a method with the Vector1D scalarMultiply(double a) signature.
     */
    @Test
    public void scalarMultiply() {
        // Arrange
        Vector1D a = (new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4 })).viewColumn(0);
        Vector1D b = (new DenseDoubleMatrix1D(new double[] { 2, 4, 6, 8 })).viewColumn(0);
        // Act
        Vector1D c = a.scalarMultiply(2);
        // Assert
        assertEquals(4.0, c.getQuick(0), 0.000001);
        assertEquals(8.0, c.getQuick(1), 0.000001);
        assertEquals(12.0, c.getQuick(2), 0.000001);
        assertEquals(16.0, c.getQuick(3), 0.000001);
    }
}