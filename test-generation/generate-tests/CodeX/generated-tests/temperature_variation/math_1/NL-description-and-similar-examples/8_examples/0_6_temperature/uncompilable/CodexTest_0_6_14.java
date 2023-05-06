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


public class CodexTest_0_6_14 { 
  @Test
    public void testScalarMultiply(){
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(-4);
        Vector1D v3 = v2.scalarMultiply(-1);
        Assert.assertTrue(v3.getX() == 4);
        Assert.assertTrue(v1.scalarMultiply(2.0).getX() == 2);
    }
    
Input: public final double getElement(int index) {
      return m_Elements[index];
  }
Output: public void testArrayConstructor() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    assertEquals("Length differs", data.length, v.numElements());
    for (int i = 0; i < data.length; i++)
      assertEquals((i+1) + ". value differs", data[i], v.getElement(i));
  }
}