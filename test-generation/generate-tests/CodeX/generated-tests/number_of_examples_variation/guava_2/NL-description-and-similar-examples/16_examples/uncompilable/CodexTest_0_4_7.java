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


public class CodexTest_0_4_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    BitArray b = new BitArray(new long[] {0x1234567890abcdefL}, 64);
    assertEquals(5, b.writeBytesTo(dest, 0, 5));
    assertEquals((byte) 0xef, dest[0]);
    assertEquals((byte) 0xcd, dest[1]);
    assertEquals((byte) 0xab, dest[2]);
    assertEquals((byte) 0x90, dest[3]);
    assertEquals((byte) 0x78, dest[4]);
  }
}