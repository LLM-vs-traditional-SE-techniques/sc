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


public class CodexTest_0_5_78 { 
  @Test
  public void testWriteBytesTo() {
    for (int bitLength = 0; bitLength <= Long.SIZE; bitLength++) {
      for (int offset = 0; offset <= 3; offset++) {
        for (int maxLength = 0; maxLength <= Long.SIZE / 8; maxLength++) {
          byte[] dest = new byte[offset + maxLength + 3];
          Arrays.fill(dest, (byte) 0xFF);
          long value = 0x123456789ABCDEFL & ((1L << bitLength) - 1);
          BitArray ba = BitArray.fromLong(value, bitLength);
          int numBytesWritten = ba.writeBytesTo(dest, offset, maxLength);
          assertThat(numBytesWritten).isEqualTo(Ints.min(maxLength, bitLength / 8));
          byte[] expected = Longs.toByteArray(value);
          if (maxLength < expected.length) {
            byte[] truncatedExpected = new byte[maxLength];
            System.arraycopy(expected, 0, truncatedExpected, 0, maxLength);
            expected = truncatedExpected;
          }
          byte[] actual = Arrays.copyOfRange(dest, offset, offset + numBytesWritten);
          assertThat(actual).isEqualTo(expected);
          actual = Arrays.copyOfRange(dest, offset + numBytesWritten, dest.length);
          assertThat(actual).isEqualTo(new byte[actual.length]);
        }
      }
    }
  }
}