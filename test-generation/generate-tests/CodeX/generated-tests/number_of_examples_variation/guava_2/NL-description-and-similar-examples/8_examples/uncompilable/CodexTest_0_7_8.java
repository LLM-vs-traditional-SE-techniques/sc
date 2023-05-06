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


public class CodexTest_0_7_8 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    BitSet bits = new BitSet(64);
    // Check that a full byte is written
    bits.set(0);
    assertEquals(1, bits.writeBytesTo(dest, 0, 1));
    assertEquals((byte) 1, dest[0]);
    // Check that part of a byte is written
    Arrays.fill(dest, (byte) 0);
    bits.set(0, 4);
    assertEquals(1, bits.writeBytesTo(dest, 0, 1));
    assertEquals((byte) 0xf, dest[0]);
    // Check that multiple bytes are written
    Arrays.fill(dest, (byte) 0);
    bits.set(0, 16);
    assertEquals(2, bits.writeBytesTo(dest, 0, 2));
    assertEquals((byte) 0xff, dest[0]);
    assertEquals((byte) 0xff, dest[1]);
    // Check that not too many bytes are written
    Arrays.fill(dest, (byte) 0);
    bits.set(0, 16);
    assertEquals(1, bits.writeBytesTo(dest, 0, 1));
    assertEquals((byte) 0xff, dest[0]);
    assertEquals((byte) 0, dest[1]);
  }
}