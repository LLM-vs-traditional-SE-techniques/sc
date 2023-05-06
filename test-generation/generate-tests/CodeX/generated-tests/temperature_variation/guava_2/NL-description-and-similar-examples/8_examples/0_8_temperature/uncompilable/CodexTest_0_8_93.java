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


public class CodexTest_0_8_93 { 
  @Test
  public void testWriteBytesTo_byteArray() {
    Random r = new Random(0);
    for (int numBytes = 0; numBytes < 8; numBytes++) {
      for (int offset = 0; offset < 3; offset++) {
        BigInteger bigInteger = new BigInteger(numBytes * 8, r);
        byte[] expected = bigInteger.toByteArray();
        if (expected.length < numBytes + offset) {
          // Zero-pad to the left.
          expected = Arrays.copyOfRange(
              expected, expected.length - numBytes - offset, expected.length);
          byte[] padded = new byte[numBytes + offset];
          System.arraycopy(expected, 0, padded, padded.length - expected.length,
              expected.length);
          expected = padded;
        } else if (expected.length > numBytes + offset) {
          expected = Arrays.copyOfRange(expected, expected.length - numBytes - offset,
              expected.length);
        }
        byte[] dest = new byte[numBytes + offset];
        BigInteger bigIntegerCopy = new BigInteger(bigInteger.toByteArray());
        assertEquals(numBytes,
            bigIntegerCopy.writeBytesTo(dest, offset, numBytes));
        assertTrue(Arrays.equals(expected, dest));
      }
    }
  }
  
Input: public DoubleMatrix1D vectorizableMultiply(DoubleMatrix1D y) {
		int size=this.size();
		int ySize = y.size();
		int xySize = Math.min(size, ySize);
		DoubleMatrix1D xy = this.like(xySize);
		int i=xySize;
		while (--i >= 0) {
			xy.setQuick(i, getQuick(i) * y.getQuick(i));
		}
		return xy;
	}
Output:
  public static void testVectorizableGetQuickSetQuick1D() {
    DenseDoubleMatrix1D D = new DenseDoubleMatrix1D(2);
    D.setQuick(0
}