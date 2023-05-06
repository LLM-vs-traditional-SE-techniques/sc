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


public class CodexTest_0_8_32 { 
  @Test
    private static void distanceSqTest(double[][] values, int expectedMinIndex) {
        double[] array = values[0];
        DistanceMeasure distanceMeasure = new ChebyshevDistanceMeasure();
        int minIndex = 0;
        double distanceSq = distanceMeasure.distanceSq(array, array);
        for (int i = 1; i < values.length; i++) {
            double newDistanceSq = distanceMeasure.distanceSq(array, values[i]);
            if (newDistanceSq < distanceSq) {
                minIndex = i;
                distanceSq = newDistanceSq;
            }
        }
        assertEquals("distanceSq", expectedMinIndex, minIndex);
    }
}