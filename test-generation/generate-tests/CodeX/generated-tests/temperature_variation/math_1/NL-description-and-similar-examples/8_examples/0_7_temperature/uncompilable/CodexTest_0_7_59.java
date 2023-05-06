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


public class CodexTest_0_7_59 { 
  @Test
    public void testScalarMultiply() {
        double[] u = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] v = u.clone();
        for (int i = 0; i < u.length; ++i) {
            u[i] *= 4;
        }
        FieldVector<DerivativeStructure> fvU = new ArrayFieldVector<DerivativeStructure>(u);
        FieldVector<DerivativeStructure> fvV = fvU.mapMultiplyToSelf(4);
        Assert.assertEquals(0, fvU.subtract(fvV).getNorm(), 1.0e-15);
    }
}