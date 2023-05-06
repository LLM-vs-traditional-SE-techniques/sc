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


public class CodexTest_0_6_41 { 
  @Test
  public void testWriteBytesTo() {
    for (int numBytes = 0; numBytes < 8; numBytes++) {
      for (int offset = 0; offset < 3; offset++) {
        byte[] expected = new byte[offset + numBytes];
        byte[] dest = new byte[offset + numBytes + 5];
        Arrays.fill(dest, (byte) 0x42);
        long value = numBytes == 8 ? 0x1234567890ABCDEFL : (1L << (numBytes * 8)) - 1;
        BitArray bits = BitArray.fromLong(value);
        int numBytesWritten = bits.writeBytesTo(dest, offset, numBytes);
        assertEquals(numBytes, numBytesWritten);
        System.arraycopy(expected, 0, dest, offset, numBytes);
        assertTrue(Arrays.equals(expected, dest));
      }
    }
  }
}