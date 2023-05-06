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


public class CodexTest_0_9_1 { 
  @Test
    public void testDistanceSq() {
        Vector1D v = new Vector1D(1);
        Vector1D v1 = new Vector1D(2);
        Vector1D v2 = new Vector1D(4);
        Vector1D v3 = new Vector1D(7);
        Assert.assertEquals(0.0, Vector1D.distanceSq(null, v), 1.0e-12);
        Assert.assertEquals(Util.eq(v.subtract(v3).getNormSq(), 1.0),
                            Util.eq(Vector1D.distanceSq(v, v3), 1.0));
    }
 */
function methodWithExponentialBehavior(n, x) {
	if(n < 0) {
		throw "N must be >= 0";
	}
	return Util.eq(Math.abs(Math.pow(2, n) - x), 0) ? x : methodWithExponentialBehavior(n - 1, x / 2);
}
}