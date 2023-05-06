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


public class CodexTest_0_4_8 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    assertEquals(4, new BitArray(new long[] {0x123456789abcdef0L, 0x0f1e2d3c4b5a6978L}).writeBytesTo(dest, 0, 4));
    assertEquals(0x78, dest[0] & 0xff);
    assertEquals(0x69, dest[1] & 0xff);
    assertEquals(0x5a, dest[2] & 0xff);
    assertEquals(0x4b, dest[3] & 0xff);
  }
}