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


public class CodexTest_0_5_99 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    long[] data = {0x123456789abcdef0L, 0x0fedcba987654321L};
    BitArray array = BitArray.fromLongArray(data, 128);
    int written = array.writeBytesTo(dest, 0, 3);
    assertEquals(3, written);
    assertEquals(0x12, dest[0] & 0xff);
    assertEquals(0x34, dest[1] & 0xff);
    assertEquals(0x56, dest[2] & 0xff);
    written = array.writeBytesTo(dest, 0, 4);
    assertEquals(4, written);
    assertEquals(0x78, dest[0] & 0xff);
    assertEquals(0x9a, dest[1] & 0xff);
    assertEquals(0xbc, dest[2] & 0xff);
    written = array.writeBytesTo(dest, 1, 2);
    assertEquals(2, written);
    assertEquals(0x9a, dest[0] & 0xff);
    assertEquals(0xbc, dest[1] & 0xff);
    assertEquals(0xde, dest[2] & 0xff);
  }
}