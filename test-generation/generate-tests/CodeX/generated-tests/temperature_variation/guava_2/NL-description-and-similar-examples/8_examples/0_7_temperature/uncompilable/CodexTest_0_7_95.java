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


public class CodexTest_0_7_95 { 
  @Test
  public void testWriteBytesToImpl() {
    byte[] dest = new byte[7];
    long[] data = { 0x123456789abcdef0L, 0x0fedcba987654321L };
    BitArray ba = BitArray.fromLongArray(data);
    ba.writeBytesTo(dest, 3, 7);
    assertEquals(0x12, dest[0]);
    assertEquals(0x34, dest[1]);
    assertEquals(0x56, dest[2]);
    assertEquals(0x78, dest[3]);
    assertEquals(0x9a, dest[4]);
    assertEquals(0xbc, dest[5]);
    assertEquals(0xde, dest[6]);
  }
}