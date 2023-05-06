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


public class CodexTest_0_6_32 { 
  @Test
    public static void main(String[] args) {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(2);
        Vector1D v3 = v1.scalarMultiply(2);
        double dot = v1.dotProduct(v2);
        double cos = v1.cosine(v2);
        double theta = v1.angle(v2);
        Vector1D v4 = v1.add(v2);
        Vector1D v5 = v1.subtract(v2);
        Vector1D v6 = v2.normalize();
        Vector1D v7 = v2.normalize().scalarMultiply(v2.getNorm());
        Vector1D v8 = v1.scalarMultiply(2).add(v2);
    }

}