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


public class CodexTest_0_8_74 { 
  @Test
    public static void doubleTest12() {
        DenseDoubleMatrix1D A1 = new DenseDoubleMatrix1D(3,3);
        DenseDoubleMatrix1D A2 = new DenseDoubleMatrix1D(3,3);
        DenseDoubleMatrix1D A3 = new DenseDoubleMatrix1D(3,3);
        DenseDoubleMatrix1D A4 = new DenseDoubleMatrix1D(3,3);
        A1.assign(new cern.jet.random.engine.MersenneTwister());
        A2.assign(1.0);
        A3.assign(2.0);
        A4.assign(A1.scalarMultiply(3.0));
        A3.assign(A1);
        A3.assign(A3.scalarMultiply(3.0));
        A2.assign(A4);
        System.out.println(A4);
        System.out.println(A3);
        System.out.println(A2);
    }

}