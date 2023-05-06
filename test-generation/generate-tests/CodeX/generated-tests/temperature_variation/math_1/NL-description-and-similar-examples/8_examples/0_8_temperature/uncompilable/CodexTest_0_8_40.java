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


public class CodexTest_0_8_40 { 
  @Test
    private static Vector1D multiplyVectorByScalar(DoubleMatrix1D v1, double scalar) {
        return (new DenseDoubleMatrix1D(v1)).assign(DoubleFunctions.multSecond(scalar));
    }
    public void testMultiplyVectorByScalar() {
        DoubleMatrix1D v1 = new DenseDoubleMatrix1D(new double[]{0.0, 1.0, 2.0, 3.0});
        testMultiplyVectorByScalar(v1, 0.1);
        testMultiplyVectorByScalar(v1, 0.0);
        testMultiplyVectorByScalar(v1, 10.0);
    }

}