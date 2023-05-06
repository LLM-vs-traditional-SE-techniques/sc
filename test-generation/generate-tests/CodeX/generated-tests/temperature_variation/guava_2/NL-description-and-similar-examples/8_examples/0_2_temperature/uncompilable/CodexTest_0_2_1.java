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


public class CodexTest_0_2_1 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 4;
    int bits = 32;
    int bytes = bits / 8;
    int length = Math.min(maxLength, bytes);
    int expectedLength = length;
    int expectedOffset = offset + length;
    int expectedDestLength = offset + length;
    int expectedBits = bits;
    int expectedBytes = bytes;
    int expectedMaxLength = maxLength;
    byte[] expectedDest = new byte[expectedDestLength];
    int actualLength = writeBytesTo(dest, offset, maxLength);
    assertEquals(expectedLength, actualLength);
    assertEquals(expectedOffset, offset);
    assertEquals(expectedDestLength, dest.length);
    assertEquals(expectedBits, bits());
    assertEquals(expectedBytes, bytes());
    assertEquals(expectedMaxLength, maxLength);
    assertArrayEquals(expectedDest, dest);
  }
}