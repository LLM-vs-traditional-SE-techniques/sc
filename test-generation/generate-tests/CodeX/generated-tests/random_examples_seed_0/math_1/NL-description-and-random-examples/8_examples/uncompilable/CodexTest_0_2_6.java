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


public class CodexTest_0_2_6 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(1.0, 2.0);
        Vector1D v1 = v.scalarMultiply(2.0);
        Vector1D v2 = v.scalarMultiply(0.0);
        Vector1D v3 = v.scalarMultiply(-1.0);
        Vector1D v4 = v.scalarMultiply(Double.POSITIVE_INFINITY);
        Vector1D v5 = v.scalarMultiply(Double.NEGATIVE_INFINITY);
        Vector1D v6 = v.scalarMultiply(Double.NaN);
        Vector1D v7 = v.scalarMultiply(Double.MIN_VALUE);
        Vector1D v8 = v.scalarMultiply(Double.MAX_VALUE);
        Vector1D v9 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v10 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v11 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v12 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v13 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v14 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v15 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v16 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v17 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v18 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v19 = v.scalarMultiply(Double.MIN_NORMAL);
        Vector1D v20 = v.scalarMultiply(Double.
}