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


public class CodexTest_0_8_3 { 
  @Test
    public static void testMatrixVectorMultiply() {
        double[][] arrMatrix = 
        { 
            { 1, 2, 3},
            { 2, 3, 4},
            { 3, 4, 5},
            { 4, 5, 6},
            { 5, 6, 7},
            { 6, 7, 8},
            { 7, 8, 9},
            { 8, 9, 10}
        };
        double[] data = {3, -3, 1};
        Vector1D vector = new Vector1D(data);
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix2D matrix = f.make(arrMatrix);
        DoubleMatrix1D res = vector.scalarMultiply(matrix.rows());
}