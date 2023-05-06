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


public class CodexTest_0_2_53 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int written = new BitArray(new long[] {0x123456789abcdef0L}, 64).writeBytesTo(dest, 2, 5);
    assertEquals(5, written);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0x12, dest[2]);
    assertEquals(0x34, dest[3]);
    assertEquals(0x56, dest[4]);
    assertEquals(0x78, dest[5]);
    assertEquals(0x9a, dest[6]);
    assertEquals(0xbc, dest[7]);
    assertEquals(0xde, dest[8]);
    assertEquals(0xf0, dest[9]);
  }
}