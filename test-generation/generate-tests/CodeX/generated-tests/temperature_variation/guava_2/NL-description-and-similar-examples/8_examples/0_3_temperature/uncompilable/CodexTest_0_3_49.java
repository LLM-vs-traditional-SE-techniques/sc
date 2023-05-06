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


public class CodexTest_0_3_49 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 3;
    int bits = 24;
    int bytes = bits / 8;
    int length = Math.min(maxLength, bytes);
    byte[] expected = new byte[length];
    for (int i = 0; i < length; i++) {
      expected[i] = (byte) i;
    }
    HashCode hashCode = new HashCode(bits) {
      @Override
      void writeBytesToImpl(byte[] dest, int offset, int maxLength) {
        for (int i = 0; i < maxLength; i++) {
          dest[offset + i] = (byte) i;
        }
      }
    };
    int result = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(length, result);
    assertEquals(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        Ints.asList(dest));
  }
}