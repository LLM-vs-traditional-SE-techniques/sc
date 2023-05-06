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


public class CodexTest_0_6_10 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[7];
    assertEquals(7, new BitArray(new byte[] {0x01, 0x23, 0x45, 0x67, (byte) 0x89, (byte) 0xab, (byte) 0xcd, (byte) 0xef}).writeBytesTo(dest, 1, 7));
    assertEquals(0x01, dest[0]);
    assertEquals(0x23, dest[1]);
    assertEquals(0x45, dest[2]);
    assertEquals(0x67, dest[3]);
    assertEquals((byte) 0x89, dest[4]);
    assertEquals((byte) 0xab, dest[5]);
    assertEquals((byte) 0xcd, dest[6]);
  }
}