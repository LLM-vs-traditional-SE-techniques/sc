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


public class CodexTest_0_9_7 { 
  @Test
                            
Input: public final double elementSum() { return DoubleMatrix1DArrayMethods.elementSum(this); }
Output:  ----
Input: public final double[][] elements() { return (double[][])viewElements(); }
Output: public void testElementMultiply() {
		  double[] vals = {1,2,3};
		  double[] result = {2,4,6};
		  AlgVector v = new AlgVector(vals);
		  AlgVector factor = new AlgVector(vals);
		  AlgVector v_result = v.elementMultiply(factor);
		  TestUtils.assertEquals("Result differs", result, v_result.elements(), 1e-8);
		}
}