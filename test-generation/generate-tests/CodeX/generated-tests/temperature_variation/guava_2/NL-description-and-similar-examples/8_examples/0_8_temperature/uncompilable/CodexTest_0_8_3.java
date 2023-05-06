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


public class CodexTest_0_8_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[16];
    long newBits = Long.MIN_VALUE;
    for (int i = 0; i < 16; i++) {
      newBits += (1L << (i * 8));
      long value = newBits;
      assertEquals(i, Longs.toByteArray(value).length);
      // Test output to exact length
      BigInteger bigValue = BigInteger.valueOf(value);
      MutableBooleanArithmetic.writeBytesTo(bigValue, dest, 0, i);
      assertEquals(bigValue, new BigInteger(1, dest));
      Arrays.fill(dest, (byte) 0);
      // Test output to too-long array
      MutableBooleanArithmetic.writeBytesTo(bigValue, dest, 0, i + 1);
      assertEquals(bigValue, new BigInteger(1, dest));
      Arrays.fill(dest, (byte) 0);
      // Test output to array with offset
      MutableBooleanArithmetic.writeBytesTo(bigValue, dest, 10, i + 10);
      assertEquals(bigValue, new BigInteger(1, Arrays.copyOfRange(dest, 10, 20)));
      Arrays.fill(dest, (byte) 0);
    }
  }
}