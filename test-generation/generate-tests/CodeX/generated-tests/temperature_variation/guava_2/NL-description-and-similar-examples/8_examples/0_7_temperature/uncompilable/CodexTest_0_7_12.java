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


public class CodexTest_0_7_12 { 
  @Test
    public void testWriteBytesTo() {
    // positive tests
    for (int numBytes = 0; numBytes < BYTES.length; numBytes++) {
      byte[] dest = new byte[numBytes];
      assertEquals(numBytes, BYTES.writeBytesTo(dest, 0, numBytes));
      assertTrue(Arrays.equals(Arrays.copyOf(BYTES.bytes, numBytes), dest));
    }
    // numBytes too small
    try {
      BYTES.writeBytesTo(new byte[BYTES.bytes.length - 1], 0, BYTES.bytes.length);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
    // offset + numBytes too big
    try {
      BYTES.writeBytesTo(new byte[BYTES.bytes.length], 1, BYTES.bytes.length);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
    // offset too small
    try {
      BYTES.writeBytesTo(new byte[BYTES.bytes.length], -1, BYTES.bytes.length);
      fail();
    } catch (IndexOutOfBoundsException expected) {}
  }
}