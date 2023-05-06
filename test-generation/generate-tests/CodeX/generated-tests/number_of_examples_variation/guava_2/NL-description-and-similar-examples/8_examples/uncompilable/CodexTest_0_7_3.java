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


public class CodexTest_0_7_3 { 
  @Test
  public void testToByteArray() {
    for (int n = 0; n < 63; n++) {
      for (int offset = 0; offset <= 6; offset++) {
        int length = n + offset;
        byte[] expected = new byte[length];
        byte[] dest = new byte[length];
        Arrays.fill(expected, (byte) 0xA5);
        BigInteger i = BigInteger.valueOf(0x5A5A5A5A5A5A5A5AL)
            .shiftLeft(n * 8).shiftRight(offset * 8);
        byte[] biBytes = i.toByteArray();
        System.arraycopy(biBytes, 0, expected, offset, biBytes.length);
        BitArray bits = BitArray.fromBitArray(i, n);
        assertEquals(n, bits.bits());
        assertEquals(length, bits.writeBytesTo(dest, offset, length - offset));
        assertTrue(Arrays.equals(expected, dest));
      }
    }
  }
}