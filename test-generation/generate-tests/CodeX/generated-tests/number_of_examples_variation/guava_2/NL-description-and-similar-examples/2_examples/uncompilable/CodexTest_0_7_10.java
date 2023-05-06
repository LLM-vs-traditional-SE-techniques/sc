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


public class CodexTest_0_7_10 { 
  @Test
  public void testWriteBytesTo_upto_maxLength_bytes() {
    byte[] dest = new byte[20];
    byte[] expected = new byte[20];
    for (int i = 0; i < expected.length; i++) {
      expected[i] = (byte) (i % 4);
    }
    BitArray bitArray = BitArray.fromBytes(expected);
    for (int i = 0; i < dest.length; i++) {
      Arrays.fill(dest, (byte) 0);
      int written = bitArray.writeBytesTo(dest, 0, i);
      assertEquals(i, written);
      assertEquals(i, bitArray.length());
      assertEquals(i * 8, bitArray.bits());
      assertEquals(i, bitArray.bytes());
      assertArrayEquals(Arrays.copyOf(expected, i), dest);
    }
  }
}