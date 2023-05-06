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


public class CodexTest_0_7_7 { 
  @Test
  public void testWriteBytes() {
    byte[] dest = new byte[16];
    BigInteger[] inputs = {
      BigInteger.ZERO,
      BigInteger.ONE,
      BigInteger.valueOf(-1),
      BigInteger.valueOf(Integer.MAX_VALUE),
      BigInteger.valueOf(Integer.MIN_VALUE),
      new BigInteger("8000000000000000", 16),
      new BigInteger("7fffffffffffffff", 16),
      new BigInteger("ffffffffffffffff", 16),
      new BigInteger("10000000000000000", 16),
      new BigInteger("-8000000000000000", 16),
      new BigInteger("-8000000000000001", 16),
      new BigInteger("-ffffffffffffffff", 16),
      new BigInteger("-10000000000000000", 16),
    };
    for (BigInteger input : inputs) {
      Arrays.fill(dest, (byte) 0xab);
      int numBytes = LessThanBranchFree.writeBigEndian(dest, 0, input);
      byte[] expected = input.toByteArray();
      if (expected[0] == 0) {
        // Strip the unnecessary leading zero byte.
        expected = Arrays.copyOfRange(expected, 1, expected.length);
      }
      assertEquals(expected.length, numBytes);
      for (int i = 0; i < numBytes; i++) {
        assertEquals(expected[expected.length - i - 1], dest[i]);
      }
      for (int i = numBytes; i < dest.length; i++) {
        assertEquals((byte) 0xab, dest[i]);
      }
    }
  }
}