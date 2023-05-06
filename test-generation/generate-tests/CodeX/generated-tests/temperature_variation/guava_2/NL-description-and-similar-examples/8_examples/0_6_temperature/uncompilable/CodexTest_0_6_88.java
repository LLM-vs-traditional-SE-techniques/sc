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


public class CodexTest_0_6_88 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[6];
    dest[0] = (byte) 0xFF;
    dest[2] = (byte) 0xFF;
    dest[3] = (byte) 0xFF;
    dest[4] = (byte) 0xFF;
    dest[5] = (byte) 0xFF;
    assertEquals(
        "We should have written 6 bytes",
        6,
        new BloomFilter(100, 0.03).writeBytesTo(dest, 1, dest.length - 1));
    assertEquals(
        "We should have written a 1 into the first byte",
        (byte) 0x1F,
        dest[0]);
    assertEquals(
        "We should have written a 3 into the second byte",
        (byte) 0xC0,
        dest[1]);
    assertEquals(
        "We should have written a 0 into the third byte",
        (byte) 0x00,
        dest[2]);
    assertEquals(
        "We should have written a 0 into the fourth byte",
        (byte) 0x00,
        dest[3]);
    assertEquals(
        "We should have written a 0 into the fifth byte",
        (byte) 0x00,
        dest[4]);
    assertEquals(
        "We should have written a 0 into the sixth byte",
        (byte) 0x00,
        dest[5]);
  }
}