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


public class CodexTest_0_8_92 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    assertEquals(2, Bytes.fromBitArray(BitArray.fromBitIndexes(new int[] {1, 35, 36})).writeBytesTo(dest, 1, 2));
    // index 0 is untouched
    assertEquals(0, dest[0]);
    // the first two bytes are set correctly
    assertEquals(0, dest[1]);
    assertEquals(-128, dest[2]);
  }
Input: public static void main(String[] args) {
			double[] data={1,2,3,4,5,6};
			double[][] arrMatrix = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			DoubleMatrix2D matrix = f.make(arrMatrix);
			DoubleMatrix1D res = vector.like(matrix.rows());
}