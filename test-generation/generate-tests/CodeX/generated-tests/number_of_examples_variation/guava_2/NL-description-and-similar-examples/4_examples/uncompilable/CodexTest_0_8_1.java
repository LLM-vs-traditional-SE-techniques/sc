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


public class CodexTest_0_8_1 { 
  @Test
  public void testWriteBytes_big() {
    long value = 0x1234567890ABCDEFL;
    int numBits = 64;
    byte[] expected = new byte[] {
        0x12, 0x34, 0x56, 0x78, 0x90, (byte) 0xAB, (byte) 0xCD, (byte) 0xEF};
    assertEquals(NUM_BITS, numBits);
    byte[] dest = new byte[NUM_BITS / 8];
    // should write all 8 bytes.
    assertEquals(8, writeBytesTo(dest, 0, numBits / 8));
    assertEquals(expected, dest);
  }
}