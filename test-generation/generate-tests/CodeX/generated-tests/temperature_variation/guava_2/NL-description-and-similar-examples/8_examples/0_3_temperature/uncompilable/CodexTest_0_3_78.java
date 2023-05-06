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


public class CodexTest_0_3_78 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int length = new BitArray(new byte[] {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF}, 64).writeBytesTo(dest, 0, 8);
    assertEquals(8, length);
    assertEquals((byte) 0xFF, dest[0]);
    assertEquals((byte) 0xFF, dest[1]);
    assertEquals((byte) 0xFF, dest[2]);
    assertEquals((byte) 0xFF, dest[3]);
    assertEquals((byte) 0xFF, dest[4]);
    assertEquals((byte) 0xFF, dest[5]);
    assertEquals((byte) 0xFF, dest[6]);
    assertEquals((byte) 0xFF, dest[7]);
  }
}