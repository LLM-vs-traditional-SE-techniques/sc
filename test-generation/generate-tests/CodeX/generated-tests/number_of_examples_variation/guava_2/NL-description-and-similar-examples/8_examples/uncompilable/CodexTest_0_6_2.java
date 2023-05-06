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


public class CodexTest_0_6_2 { 
  @Test
  public void testWriteBytesTo() {
    for (int numBytes = 0; numBytes <= 8; numBytes++) {
      for (int offset = 0; offset <= 3; offset++) {
        byte[] dest = new byte[offset + numBytes + 5];
        Arrays.fill(dest, (byte) 0xFF);
        long value = 0x0123456789ABCDEFL;
        value >>>= 64 - (numBytes * 8);
        BitSet bits = BitSet.valueOf(new long[] {value});
        int writtenBytes = bits.writeBytesTo(dest, offset, numBytes + 1);
        assertEquals(numBytes, writtenBytes);
        for (int i = 0; i < offset; i++) {
          assertEquals((byte) 0xFF, dest[i]);
        }
        for (int i = offset; i < offset + numBytes; i++) {
          assertEquals((byte) (value >>> ((offset + numBytes - i - 1) * 8)), dest[i]);
        }
        for (int i = offset + numBytes; i < dest.length; i++) {
          assertEquals((byte) 0xFF, dest[i]);
        }
      }
    }
  }
}