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


public class CodexTest_0_7_1 { 
  @Test
    public static void testDistanceSq() {
        double x = 4;
        double y = 5;
        Vector1D p1 = new Vector1D(x, y);
        double x2 = 1;
        double y2 = 0;
        Vector1D p2 = new Vector1D(x2, y2);
        double d2 = Vector2D.distanceSq(p1, p2);
        double d = Vector2D.distance(p1, p2);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("distanceSq = " + d2);
        System.out.println("distance = " + d);
        System.out.println("distanceSq = " + p1.distanceSq(p2));
    }
}