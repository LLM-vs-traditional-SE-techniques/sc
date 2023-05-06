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


public class CodexTest_0_6_4 { 
  @Test
    public void testDistanceSq() {
        assertEquals(0.0, distanceSq(new Vector1D(0.0), new Vector1D(0.0)), 0.0);
        assertEquals(0.0, distanceSq(new Vector1D(0.0), new Vector1D(0.0)), 0.1);
        assertEquals(0.0, distanceSq(new Vector1D(0.0), new Vector1D(0.0)), 0.5);
        assertEquals(0.0, distanceSq(new Vector1D(0.0), new Vector1D(0.0)), 1.0);
        assertEquals(0.0, distanceSq(new Vector1D(0.0), new Vector1D(0.0)), 2.0);
}

}