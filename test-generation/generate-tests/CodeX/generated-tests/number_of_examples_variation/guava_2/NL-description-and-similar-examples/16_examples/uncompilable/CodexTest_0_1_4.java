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


public class CodexTest_0_1_4 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    assertEquals(10, new BitArray(new long[] {0x0123456789abcdefL}, 64).writeBytesTo(dest, 0, 10));
    assertEquals(0x01, dest[0]);
    assertEquals(0x23, dest[1]);
    assertEquals(0x45, dest[2]);
    assertEquals(0x67, dest[3]);
    assertEquals(0x89, dest[4]);
    assertEquals(0xab, dest[5]);
    assertEquals(0xcd, dest[6]);
    assertEquals(0xef, dest[7]);
    assertEquals(0x00, dest[8]);
    assertEquals(0x00, dest[9]);
  }
}