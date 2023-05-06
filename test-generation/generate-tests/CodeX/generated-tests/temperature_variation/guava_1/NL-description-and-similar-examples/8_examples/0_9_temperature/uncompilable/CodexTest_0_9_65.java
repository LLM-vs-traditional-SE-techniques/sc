import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_65 { 
  @Test
  public void testObjectHashCode() {
    HashCode hashCode42 = HashCode.fromLong(42);
    assertEquals(42, hashCode42.hashCode());
  }
	
Input: public static SimpleRegression createRegression(double[][] data,boolean includeIntercept) throws ModelSpecificationException {
        if (data == null) {
            throw new IllegalArgumentException("The data argument must not be null.");
        }
        if (data.length < 2) {
            throw new ModelSpecificationException(LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS, data.length, 1);
        }
        int nX = data[0].length - 1;
        if (nX < 1) {
            throw new ModelSpecificationException(LocalizedFormats.NOT_ENOUGH_DATA_FOR_PREDICTORS, nX);
        }
        SimpleRegression result = new SimpleRegression();
        result.addData(data);
        if (includeIntercept) {
            result.addIntercept();
        }
        return result;
    }
Output: public void testCreateRegresssion() {
        SimpleRegression sr = Regression.createRegression(getData(), true);
        assertEquals(sr.getIntercept(), 0.0, 10E-12);
        assertEquals(sr.getSlope(), 1.0, 10E-12);
        assertEquals(sr.getSlopeStdErr(),0.0, 10E-12);
        assertEquals(sr.getInterceptStdErr(),0.0, 10E-12);
    }
}