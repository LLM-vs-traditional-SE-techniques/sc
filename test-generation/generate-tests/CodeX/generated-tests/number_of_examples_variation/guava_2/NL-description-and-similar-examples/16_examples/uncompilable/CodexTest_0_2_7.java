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


public class CodexTest_0_2_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int written = new BitArray(new long[] {0x123456789abcdef0L, 0xfedcba9876543210L}, 128).writeBytesTo(dest, 0, dest.length);
    assertEquals(10, written);
    assertEquals(0x12, dest[0] & 0xff);
    assertEquals(0x34, dest[1] & 0xff);
    assertEquals(0x56, dest[2] & 0xff);
    assertEquals(0x78, dest[3] & 0xff);
    assertEquals(0x9a, dest[4] & 0xff);
    assertEquals(0xbc, dest[5] & 0xff);
    assertEquals(0xde, dest[6] & 0xff);
    assertEquals(0xf0, dest[7] & 0xff);
    assertEquals(0xfe, dest[8] & 0xff);
    assertEquals(0xdc, dest[9] & 0xff);
  }
}