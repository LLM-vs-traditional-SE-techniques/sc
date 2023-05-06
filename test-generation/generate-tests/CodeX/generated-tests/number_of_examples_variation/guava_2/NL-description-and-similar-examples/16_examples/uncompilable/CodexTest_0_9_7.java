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


public class CodexTest_0_9_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] expected = {(byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef};
    TestBitArray bits = TestBitArray.fromBitString("11011110101011011011111011101111");
    byte[] target = new byte[4];
    // write first 3 bytes
    bits.writeBytesTo(target, 0, 3);
    assertEquals("Expected 3 bytes to be written at offset 0",
        Arrays.copyOf(expected, 3),
        Arrays.copyOf(target, 3));
    Arrays.fill(target, (byte) 0);
    // write 3 bytes at offset 1
    bits.writeBytesTo(target, 1, 3);
    assertEquals("Expected 3 bytes to be written at offset 1",
        new byte[] {0, expected[0], expected[1], expected[2]}, target);
    Arrays.fill(target, (byte) 0);
    // write 3 bytes at offset 10000 (noop)
    bits.writeBytesTo(target, 10000, 3);
    assertEquals("Expected no bytes to be written at offset 10000", target, target);
  }
}