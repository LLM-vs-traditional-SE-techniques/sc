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


public class CodexTest_0_5_69 { 
  @Test
  public void testWriteBytesTo() {
    for (int bits = 0; bits < 64; bits++) {
      for (int i = 0; i < 100; i++) {
        BigInteger value = BigInteger.valueOf(TestUtil.nextLong());
        value = value.and(BigInteger.ONE.shiftLeft(bits).subtract(BigInteger.ONE));
        BigIntegerHashCode hashCode = BigIntegerHashCode.fromBytes(value.toByteArray());
        byte[] dest = new byte[bits / 8 + 1];
        int written = hashCode.writeBytesTo(dest, 0, dest.length);
        assertEquals(bits / 8, written);
        byte[] expected = value.toByteArray();
        assertEquals(expected.length, written);
        assertEquals(new BigInteger(1, expected), new BigInteger(1, dest));
      }
    }
  }
}