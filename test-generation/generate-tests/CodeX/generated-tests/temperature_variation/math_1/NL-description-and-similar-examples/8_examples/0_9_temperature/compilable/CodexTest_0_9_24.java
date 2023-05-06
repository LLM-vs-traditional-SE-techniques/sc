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


public class CodexTest_0_9_24 { 
  @Test
      public static void testMoment4() {
        double[] probability= {0.2, 0.2, 0.2, 0.2, 0.2};
        double[] values = {9, 10, 11, 12, 13};
        double value = 0;
        int n=values.length;
        for (int i=0; i<n; i++) {
          value += probability[i]*values[i];
        }
        for (int i=0; i<n; i++) {
          System.out.print(value + " ");
          values[i] = values[i]*values[i];
          value += probability[i]*values[i];
        }
        System.out.println(value);
      }
}