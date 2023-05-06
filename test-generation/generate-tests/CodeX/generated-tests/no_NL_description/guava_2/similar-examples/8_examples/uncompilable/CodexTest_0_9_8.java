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


public class CodexTest_0_9_8 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[32];
    int numBytes = LENGTH * 8 / 5;
    int numBits = LENGTH * 8 - numBytes * 5;
    int expectedNumBytes = numBytes + (numBits == 0 ? 0 : 1);
    Bits.LE.clear(dest, 0, dest.length);
    for (int i = 0; i < expectedNumBytes; i++) {
      dest[i] = (byte) (0x1f * i);
    }
    ImmutableBitArray b = BitArrays.fromLength(LENGTH);
    int bitsWritten = b.writeBytesTo(dest, 5, numBytes);
    assertThat(bitsWritten).isEqualTo(numBytes * 8);
    for (int i = 0; i < expectedNumBytes; i++) {
      int bitsToCheck = 8;
      if (i == expectedNumBytes - 1 && numBits != 0) {
        bitsToCheck = numBits;
      }
      int expectedByteValue = 0;
      for (int j = 0; j < bitsToCheck; j++) {
        if (BitArrays.get(b, i * 8 + j + 5)) {
          expectedByteValue |= 1 << (7 - j);
        }
      }
      assertThat(dest[i]).isEqualTo((byte) expectedByteValue);
    }
  }
}