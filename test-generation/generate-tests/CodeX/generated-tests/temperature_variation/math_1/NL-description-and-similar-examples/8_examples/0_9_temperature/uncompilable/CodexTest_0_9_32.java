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


public class CodexTest_0_9_32 { 
  @Test
    public void testScalarMultiply() {
        double[][] arrMatrix = { { 2, -1, 0 }, { 2, -1, 0 } };
        DoubleMatrix2D matrix = DenseDoubleMatrix2D.Factory.make(arrMatrix);
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            double x = r.nextDouble();
            DoubleMatrix2D otherMatrix = matrix.scalarMultiply(x);
            if (matrix.size() != otherMatrix.size()) {
                assertTrue(false);
            } else {
                for (int j = 0; j < matrix.rows(); j++) {
                    if (matrix.viewRow(j).size() != otherMatrix.viewRow(j).size()) {
						assertTrue(false);
                    } else {
                        for (int k = 0; k < matrix.columns(); k++) {
                            if (matrix.get(j, k) * x != otherMatrix.get(j, k)) {
								assertTrue(false);
                            }
                        }
                    }
                }
            }
        }
        assertTrue(true);
    }
}